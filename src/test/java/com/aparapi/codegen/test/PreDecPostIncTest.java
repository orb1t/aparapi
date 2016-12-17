/**
 * Copyright (c) 2016 - 2017 Syncleus, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aparapi.codegen.test;

import org.junit.Test;

public class PreDecPostIncTest extends com.aparapi.codegen.CodeGenJUnitBase {
    private static final String[] expectedOpenCL = null;
    private static final Class<? extends com.aparapi.internal.exception.AparapiException> expectedException = null;

    @org.junit.Ignore
    @Test
    public void PreDecPostIncTest() {
        test(com.aparapi.codegen.test.PreDecPostInc.class, expectedException, expectedOpenCL);
    }

    @org.junit.Ignore
    @Test
    public void PreDecPostIncTestWorksWithCaching() {
        test(com.aparapi.codegen.test.PreDecPostInc.class, expectedException, expectedOpenCL);
    }
}
