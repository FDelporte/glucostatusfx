/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2022 Gerrit Grunwald.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.hansolo.fx.glucostatus.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;


public class Translator {
    private final String bundleBaseName;


    // ******************** Constructors **************************************
    public Translator(String bundleBaseName) {
        this.bundleBaseName = bundleBaseName;
    }


    // ******************** Methods *******************************************
    public String get(final String key) {
        ResourceBundle resourceBundle = Utf8ResourceBundle.getBundle(bundleBaseName, Locale.getDefault());
        return resourceBundle.getString(key);
    }

    public String get(final DynamicMessage message) {
        return MessageFormat.format(get(message.getKey()), message.getValues());
    }
}