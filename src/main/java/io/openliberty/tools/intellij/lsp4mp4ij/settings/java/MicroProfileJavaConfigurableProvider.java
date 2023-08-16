/*******************************************************************************
 * Copyright (c) 2023 Red Hat Inc. and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 *
 * Contributors:
 *     Red Hat Inc. - initial API and implementation
 *******************************************************************************/
package io.openliberty.tools.intellij.lsp4mp4ij.settings.java;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurableProvider;
import io.openliberty.tools.intellij.lsp4mp4ij.settings.UserDefinedMicroProfileSettings;

/**
 * MicroProfile UI settings provider for Java file.
 */
public class MicroProfileJavaConfigurableProvider extends ConfigurableProvider {

    @Override
    public Configurable createConfigurable() {
        return new MicroProfileJavaConfigurable(UserDefinedMicroProfileSettings.getInstance());
    }

    @Override
    public boolean canCreateConfigurable() {
        return true;
    }

}
