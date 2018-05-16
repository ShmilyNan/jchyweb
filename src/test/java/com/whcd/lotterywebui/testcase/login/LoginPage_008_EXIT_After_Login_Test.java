package com.whcd.lotterywebui.testcase.login;

/**
 *@author  Lance
 *@Description 测试用例：退出登陆操作
 * */
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.whcd.lotterywebui.pages.pageshelper.LoginPageHelper;
import com.whcd.lotterywebui.plugins.father.LoginFather;
import com.whcd.lotterywebui.util.PropertiesDataProvider;

public class LoginPage_008_EXIT_After_Login_Test extends LoginFather {

	@Test
	public void exitLoginTest(ITestContext context) {
		String configFilePath = context.getCurrentXmlTest().getParameter("userInfoPath");
		String username = PropertiesDataProvider.getTestData(configFilePath, "username");
		String password = PropertiesDataProvider.getTestData(configFilePath, "password");
		LoginFather.loginParpare(context, seleniumUtil);
		LoginPageHelper.checkLoginPageText(seleniumUtil);
		LoginPageHelper.login(seleniumUtil, username, password);
		LoginPageHelper.checkUserInfo(timeOut, sleepTime, seleniumUtil, username);
//		HomePageHelper.enterPage(seleniumUtil, HomePage.HP_TEXT_USERINFO);
//		seleniumUtil.click(seleniumUtil.findElementBy(HomePage.HP_LINK_EXIT));
	}

}
