/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.lang.resolve.calls.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jet.lang.descriptors.FunctionDescriptor;
import org.jetbrains.jet.lang.descriptors.TypeParameterDescriptor;
import org.jetbrains.jet.lang.descriptors.ValueParameterDescriptor;
import org.jetbrains.jet.lang.descriptors.VariableDescriptor;
import org.jetbrains.jet.lang.psi.Call;
import org.jetbrains.jet.lang.psi.ValueArgument;
import org.jetbrains.jet.lang.resolve.DelegatingBindingTrace;
import org.jetbrains.jet.lang.resolve.calls.tasks.ExplicitReceiverKind;
import org.jetbrains.jet.lang.resolve.calls.results.ResolutionStatus;
import org.jetbrains.jet.lang.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.jet.lang.types.JetType;

import java.util.List;
import java.util.Map;

public class VariableAsFunctionResolvedCall implements MutableResolvedCall<FunctionDescriptor> {
    private final MutableResolvedCall<FunctionDescriptor> functionCall;
    private final MutableResolvedCall<VariableDescriptor> variableCall;

    public VariableAsFunctionResolvedCall(@NotNull MutableResolvedCall<FunctionDescriptor> functionCall,
            @NotNull MutableResolvedCall<VariableDescriptor> variableCall) {
        this.functionCall = functionCall;
        this.variableCall = variableCall;
    }

    @NotNull
    public MutableResolvedCall<FunctionDescriptor> getFunctionCall() {
        return functionCall;
    }

    @NotNull
    public MutableResolvedCall<VariableDescriptor> getVariableCall() {
        return variableCall;
    }

    @NotNull
    @Override
    public Call getCall() {
        return variableCall.getCall();
    }

    @NotNull
    @Override
    public FunctionDescriptor getCandidateDescriptor() {
        return functionCall.getResultingDescriptor();
    }

    @NotNull
    @Override
    public FunctionDescriptor getResultingDescriptor() {
        return functionCall.getResultingDescriptor();
    }

    @NotNull
    @Override
    public ReceiverValue getReceiverArgument() {
        return variableCall.getReceiverArgument();
    }

    @NotNull
    @Override
    public ReceiverValue getThisObject() {
        return variableCall.getThisObject();
    }

    @NotNull
    @Override
    public ExplicitReceiverKind getExplicitReceiverKind() {
        return variableCall.getExplicitReceiverKind();
    }

    @NotNull
    @Override
    public Map<ValueParameterDescriptor, ResolvedValueArgument> getValueArguments() {
        return functionCall.getValueArguments();
    }

    @Nullable
    @Override
    public List<ResolvedValueArgument> getValueArgumentsByIndex() {
        return functionCall.getValueArgumentsByIndex();
    }

    @NotNull
    @Override
    public ArgumentMapping getArgumentMapping(@NotNull ValueArgument valueArgument) {
        return functionCall.getArgumentMapping(valueArgument);
    }

    @NotNull
    @Override
    public Map<TypeParameterDescriptor, JetType> getTypeArguments() {
        return functionCall.getTypeArguments();
    }

    @NotNull
    @Override
    public ResolutionStatus getStatus() {
        return variableCall.getStatus().combine(functionCall.getStatus());
    }

    @Override
    public boolean isDirty() {
        return functionCall.isDirty();
    }

    @Override
    public DelegatingBindingTrace getTrace() {
        //functionCall.trace is temporary trace above variableCall.trace and is committed already
        return variableCall.getTrace();
    }

    @Override
    public boolean isSafeCall() {
        return variableCall.isSafeCall() || functionCall.isSafeCall();
    }

    @Override
    public boolean hasIncompleteTypeParameters() {
        return variableCall.hasIncompleteTypeParameters();
    }

    @NotNull
    @Override
    public ResolvedCallImpl<FunctionDescriptor> getCallToCompleteTypeArgumentInference() {
        return functionCall.getCallToCompleteTypeArgumentInference();
    }

    @NotNull
    @Override
    public DataFlowInfoForArguments getDataFlowInfoForArguments() {
        return functionCall.getDataFlowInfoForArguments();
    }

    @Override
    public void markCallAsCompleted() {
        functionCall.markCallAsCompleted();
        variableCall.markCallAsCompleted();
    }

    @Override
    public boolean isCompleted() {
        return functionCall.isCompleted() && variableCall.isCompleted();
    }
}
