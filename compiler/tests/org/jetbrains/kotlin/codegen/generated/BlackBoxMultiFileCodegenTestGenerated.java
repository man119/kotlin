/*
 * Copyright 2010-2015 JetBrains s.r.o.
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

package org.jetbrains.kotlin.codegen.generated;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.JetTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/boxMultiFile")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class BlackBoxMultiFileCodegenTestGenerated extends AbstractBlackBoxCodegenTest {
    @TestMetadata("accessorForProtected")
    public void testAccessorForProtected() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/boxMultiFile/accessorForProtected/");
        doTestMultiFile(fileName);
    }

    @TestMetadata("accessorForProtectedInvokeVirtual")
    public void testAccessorForProtectedInvokeVirtual() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/boxMultiFile/accessorForProtectedInvokeVirtual/");
        doTestMultiFile(fileName);
    }

    public void testAllFilesPresentInBoxMultiFile() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxMultiFile"), Pattern.compile("^([^\\.]+)$"), false);
    }

    @TestMetadata("callMultifileClassMemberFromOtherPackage")
    public void testCallMultifileClassMemberFromOtherPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/boxMultiFile/callMultifileClassMemberFromOtherPackage/");
        doTestMultiFile(fileName);
    }

    @TestMetadata("internalVisibility")
    public void testInternalVisibility() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/boxMultiFile/internalVisibility/");
        doTestMultiFile(fileName);
    }

    @TestMetadata("kt1515")
    public void testKt1515() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/boxMultiFile/kt1515/");
        doTestMultiFile(fileName);
    }

    @TestMetadata("kt1528")
    public void testKt1528() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/boxMultiFile/kt1528/");
        doTestMultiFile(fileName);
    }

    @TestMetadata("kt1845")
    public void testKt1845() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/boxMultiFile/kt1845/");
        doTestMultiFile(fileName);
    }

    @TestMetadata("kt2060")
    public void testKt2060() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/boxMultiFile/kt2060/");
        doTestMultiFile(fileName);
    }

    @TestMetadata("kt2257")
    public void testKt2257() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/boxMultiFile/kt2257/");
        doTestMultiFile(fileName);
    }

    @TestMetadata("packageLocalClassNotImportedWithDefaultImport")
    public void testPackageLocalClassNotImportedWithDefaultImport() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/boxMultiFile/packageLocalClassNotImportedWithDefaultImport/");
        doTestMultiFile(fileName);
    }

    @TestMetadata("samWrappersDifferentFiles")
    public void testSamWrappersDifferentFiles() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/boxMultiFile/samWrappersDifferentFiles/");
        doTestMultiFile(fileName);
    }

    @TestMetadata("sameFileName")
    public void testSameFileName() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/boxMultiFile/sameFileName/");
        doTestMultiFile(fileName);
    }

    @TestMetadata("samePartNameDifferentFacades")
    public void testSamePartNameDifferentFacades() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/boxMultiFile/samePartNameDifferentFacades/");
        doTestMultiFile(fileName);
    }

    @TestMetadata("simple")
    public void testSimple() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/boxMultiFile/simple/");
        doTestMultiFile(fileName);
    }
}
