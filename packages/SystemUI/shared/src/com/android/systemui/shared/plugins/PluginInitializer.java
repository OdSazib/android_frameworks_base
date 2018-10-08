/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.android.systemui.shared.plugins;

import android.annotation.Nullable;
import android.content.Context;
import android.os.Looper;

/**
 * Provides necessary components for initializing {@link PluginManagerImpl}.
 */
public interface PluginInitializer {

    Looper getBgLooper();

    /**
     * This Runnable is run on the bg looper during initialization of {@link PluginManagerImpl}.
     */
    @Nullable Runnable getBgInitCallback();

    String[] getWhitelistedPlugins(Context context);

    PluginEnabler getPluginEnabler(Context context);
}
