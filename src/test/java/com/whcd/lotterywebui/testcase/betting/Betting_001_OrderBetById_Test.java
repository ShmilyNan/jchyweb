package com.whcd.lotterywebui.testcase.betting;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;
import com.whcd.lotterywebui.util.HttpRequestUtil;
import com.whcd.lotterywebui.util.HttpUtils;
import com.whcd.lotterywebui.util.PropertiesDataProvider;

/**
 * @author Lance
 * @Description 投注接口测试
 * */
public class Betting_001_OrderBetById_Test {

	@Test
	public void orderBetting(ITestContext context) {
		String betInfo = context.getCurrentXmlTest().getParameter("betInfo");		
		String interface_bet = context.getCurrentXmlTest().getParameter("interface_bet");
		String token = PropertiesDataProvider.getTestData(betInfo, "token");
		String lotteryType = PropertiesDataProvider.getTestData(betInfo, "lotteryType");
		String number = PropertiesDataProvider.getTestData(betInfo, "number");
		String content = PropertiesDataProvider.getTestData(betInfo, "content");
		String url = PropertiesDataProvider.getTestData(interface_bet, "bet_url");
//		JsonObject json = new JsonObject();
//		json.addProperty(token, token);
//		json.addProperty(lotteryType, lotteryType);
//		json.addProperty(number, number);
//		json.addProperty(content, content);
		String params ="token="+token+"&lotteryType="+lotteryType+"&number="+number+"&content="+content;
//		HttpRequestUtil.post(url,params);
		System.out.println(HttpUtils.doPost(url, params));
	}
}
