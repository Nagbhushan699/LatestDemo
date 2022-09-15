package com.demoQA.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA.Constants.Constants;
import com.demoQA.basetest.BaseClass;
import com.demoQA.page.Alert_Frame_Window_Page;
import com.demoQA.page.Alerts;

public class Alert_Test extends BaseClass{
	static Logger log=LogManager.getLogger(Alert_Test.class);
	Alerts alert;
	@BeforeClass
	public void beforeClass() {
		Alert_Frame_Window_Page alert_frame=	home.goToAlert();
		alert=alert_frame.goToAlerts();
	}
	@Test
	public void testAlert() {
		alert.clickAlert();
		Assert.assertTrue(true);
	}
	@Test
	public void testTitle() {
		String actual=	alert.getTitle();
		log.info("actual result : "+actual);
		String expected=Constants.ALERTPAGETITLE;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testTimerAlert() {
		alert.clicktimerAlert();
		boolean actual=true;
		Assert.assertTrue(actual);
	}
	@Test
	public void testConfirmAlert() {
		String actual=alert.clickConfirmAlert();
		log.info("actual result : "+actual);
		String expected=Constants.CONFIRMALERTMSG;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testPromptAlert() {
		String actual=alert.clickPromptAlert();
		log.info("actual result : "+actual);
		String expected=Constants.PROMPTALERTTEXT;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
}

