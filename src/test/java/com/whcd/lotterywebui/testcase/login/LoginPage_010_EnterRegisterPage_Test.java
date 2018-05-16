package com.whcd.lotterywebui.testcase.login;

/**
 *@author  Lance
 *@Description 在登陆页面上点击注册按钮，成功进入注册页面
 *=============已废弃===================
 * */
import org.testng.ITestContext;
import org.testng.annotations.Test;

/**
public class LoginPage_010_EnterRegisterPage_Test extends LoginFather {

	@Test
	public void enterRegisterPage(ITestContext context) {
		LoginFather.loginParpare(context, seleniumUtil);
		LoginPageHelper.enterPage(seleniumUtil, LoginPage.LP_BUTTON_REGISTER);
		RegisterPageHelper.waitRegisterPageToLoad(timeOut, seleniumUtil);
	}

}*/
import com.whcd.lotterywebui.pages.LoginPage;
import com.whcd.lotterywebui.pages.pageshelper.LoginPageHelper;
import com.whcd.lotterywebui.plugins.father.LoginFather;
