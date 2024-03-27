/*
 * Copyright 2024 Ecorous
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ecorous.cobalt;

import net.neoforged.neoforge.common.ModConfigSpec;

public class CobaltConfig {
    public ModConfigSpec.ConfigValue<Integer> fpsMultiplier;
    public ModConfigSpec.ConfigValue<Integer> potionAmplifier;
    public ModConfigSpec.ConfigValue<String> potionId;
    public CobaltConfig(ModConfigSpec.Builder builder) {
        builder.comment(" Cobalt configuration");
        fpsMultiplier = builder.define("fpsMultiplier", 2);
    }
}
