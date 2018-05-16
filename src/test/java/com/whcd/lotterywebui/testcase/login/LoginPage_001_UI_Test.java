package com.whcd.lotterywebui.testcase.login;

/**
 *@author  Lance
 *@Description 测试用例：登陆界面UI测试
 *
 * */
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.whcd.lotterywebui.pages.pageshelper.LoginPageHelper;
import com.whcd.lotterywebui.plugins.father.LoginFather;

public class LoginPage_001_UI_Test extends LoginFather {
	@Test
	public void uiTest(ITestContext context) {
		LoginFather.loginParpare(context, seleniumUtil);
		LoginPageHelper.checkInputData(seleniumUtil); 

	}

}
