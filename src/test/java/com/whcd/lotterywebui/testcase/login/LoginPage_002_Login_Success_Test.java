package com.whcd.lotterywebui.testcase.login;

/**
 *@author  Lance
 *@Description 测试用例：成功登陆
 * */
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.whcd.lotterywebui.pages.pageshelper.LoginPageHelper;
import com.whcd.lotterywebui.plugins.father.LoginFather;
import com.whcd.lotterywebui.util.PropertiesDataProvider;

public class LoginPage_002_Login_Success_Test extends LoginFather {

	@Test
	public void loginSuccessTest(ITestContext context) {
		String userInfoPath = context.getCurrentXmlTest().getParameter("userInfoPath");
		String username = PropertiesDataProvider.getTestData(userInfoPath, "username");
		String password = PropertiesDataProvider.getTestData(userInfoPath, "password");
		LoginFather.loginParpare(context, seleniumUtil);
		LoginPageHelper.login(seleniumUtil, username, password);
		LoginPageHelper.checkUserInfo(timeOut, sleepTime, seleniumUtil, username);
	}

}
