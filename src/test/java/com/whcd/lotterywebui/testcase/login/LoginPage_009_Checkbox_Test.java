package com.whcd.lotterywebui.testcase.login;

/**
 *@author  Lance
 *@Description 测试用例：登陆界面复选框是不是可以勾选
 *
 * */
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.whcd.lotterywebui.pages.pageshelper.LoginPageHelper;
import com.whcd.lotterywebui.plugins.father.LoginFather;

public class LoginPage_009_Checkbox_Test extends LoginFather{
	@Test
	public void uiTest(ITestContext context) {
		LoginFather.loginParpare(context, seleniumUtil);
		LoginPageHelper.doesCheckBoxSelect(seleniumUtil);
		
	}

}
