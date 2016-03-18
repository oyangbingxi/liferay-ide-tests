/*******************************************************************************
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 *******************************************************************************/

package com.liferay.ide.hook.ui.tests.page;

import org.eclipse.swtbot.swt.finder.SWTBot;

import com.liferay.ide.hook.ui.tests.HookConfigurationWizard;
import com.liferay.ide.project.ui.tests.ProjectWizard;
import com.liferay.ide.ui.tests.swtbot.page.ButtonPO;
import com.liferay.ide.ui.tests.swtbot.page.DialogPO;
import com.liferay.ide.ui.tests.swtbot.page.TextPO;

/**
 * @author Vicky Wang
 */
public class NewClassPO extends DialogPO implements HookConfigurationWizard, ProjectWizard
{

    private TextPO _classNameText;
    private TextPO _javaPackageText;

    private ButtonPO _createButton;

    public NewClassPO( SWTBot bot )
    {
        this( bot, TEXT_BLANK );
    }

    public NewClassPO( SWTBot bot, String title )
    {
        super( bot, title, BUTTON_CANCEL, BUTTON_OK );

        _classNameText = new TextPO( bot, LABLE_CLASS_NAME );
        _javaPackageText = new TextPO( bot, LABLE_JAVA_PACKAGE );
        _createButton = new ButtonPO( bot, BUTTON_CREATE );
    }

    public ButtonPO getCreateButton()
    {
        return _createButton;
    }

    public void setCreateButton( ButtonPO createButton )
    {
        _createButton = createButton;
    }

    public void setJavaPackage( String text )
    {
        _javaPackageText.setText( text );
    }

    public void setClassName( String text )
    {
        _classNameText.setText( text );
    }

}