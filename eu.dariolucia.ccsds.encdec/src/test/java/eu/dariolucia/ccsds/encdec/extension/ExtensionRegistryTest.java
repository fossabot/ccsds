/*
 *   Copyright (c) 2019 Dario Lucia (https://www.dariolucia.eu)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package eu.dariolucia.ccsds.encdec.extension;

import eu.dariolucia.ccsds.encdec.extension.internal.ExtensionRegistry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class ExtensionRegistryTest {

    @Test
    public void testEmptyLengthExtension() {
        try {
            ILengthMapper mapper = ExtensionRegistry.lengthMapper();
            fail("Exception expected");
        } catch (IllegalStateException e) {
            // Good
        }
    }

    @Test
    public void testEmptyTestExtension() {
        try {
            ITypeMapper mapper = ExtensionRegistry.typeMapper();
            fail("Exception expected");
        } catch (IllegalStateException e) {
            // Good
        }
    }
}
