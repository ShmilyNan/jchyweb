package com.whcd.lotterywebui.testcase.login;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.whcd.lotterywebui.pages.LoginPage;
import com.whcd.lotterywebui.pages.pageshelper.AlertPageHelper;
import com.whcd.lotterywebui.pages.pageshelper.LoginPageHelper;
import com.whcd.lotterywebui.plugins.father.LoginFather;
import com.whcd.lotterywebui.util.PropertiesDataProvider;

/**
 * @author Lance
 * @Description 登陆失败-不输入用户名，只输入密码
 * */
public class LoginPage_005_Fail_Only_Password_Test extends LoginFather {

	@Test
	public void loginFailTest_Password(ITestContext context) {
		String configFilePath = context.getCurrentXmlTest().getParameter("userInfoPath");
		String password = PropertiesDataProvider.getTestData(configFilePath, "password");
		LoginFather.loginParpare(context, seleniumUtil);
		LoginPageHelper.login(seleniumUtil, password, LoginPage.LP_INPUT_PASSCODE);
		AlertPageHelper.checkAlertInfo(seleniumUtil, waitMillisecondsForAlert);
	}

}
