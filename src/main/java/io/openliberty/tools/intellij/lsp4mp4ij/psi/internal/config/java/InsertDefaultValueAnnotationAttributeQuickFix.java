/*******************************************************************************
 * Copyright (c) 2021 Red Hat Inc. and others.
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
package io.openliberty.tools.intellij.lsp4mp4ij.psi.internal.config.java;

import io.openliberty.tools.intellij.lsp4mp4ij.psi.core.MicroProfileConfigConstants;
import io.openliberty.tools.intellij.lsp4mp4ij.psi.core.java.codeaction.InsertAnnotationAttributeQuickFix;
import org.eclipse.lsp4mp.commons.codeaction.MicroProfileCodeActionId;

/**
 * QuickFix for fixing
 * {@link MicroProfileConfigErrorCode#NO_VALUE_ASSIGNED_TO_PROPERTY} error by
 * providing several code actions:
 *
 * <ul>
 * <li>Insert defaultValue attribute annotation in the @ConfigProperty.</li>
 * </ul>
 * 
 * @author Angelo ZERR
 *
 */
public class InsertDefaultValueAnnotationAttributeQuickFix extends InsertAnnotationAttributeQuickFix {

	public InsertDefaultValueAnnotationAttributeQuickFix() {
		super(MicroProfileConfigConstants.CONFIG_PROPERTY_ANNOTATION_DEFAULT_VALUE);
	}

	@Override
	public String getParticipantId() {
		return InsertDefaultValueAnnotationAttributeQuickFix.class.getName();
	}

	@Override
	protected MicroProfileCodeActionId getCodeActionId() {
		return MicroProfileCodeActionId.ConfigPropertyInsertDefaultValue;
	}

}
