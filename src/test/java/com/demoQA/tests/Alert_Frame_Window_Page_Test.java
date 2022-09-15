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
import com.demoQA.page.Frame;
import com.demoQA.page.NestedFrames;

public class Alert_Frame_Window_Page_Test extends BaseClass{
	static Logger log=LogManager.getLogger(Alert_Frame_Window_Page_Test.class);
	Alert_Frame_Window_Page alertFrame;
	@BeforeClass
	public void beforeclass() {
		alertFrame=home.goToAlert();
	}
	@Test
	public void testAlertTitle() {
		Alerts alert=alertFrame.goToAlerts();
		String actual=	alert.getTitle();
		log.info("actual result : "+actual);
		String expected=Constants.ALERTPAGETITLE;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testFrameTitle() {
		Frame frame=alertFrame.goToFrame();
		String actual=frame.getTitle();
		log.info("actual result : "+actual);
		String expected=Constants.FRAMEPAGETITLE;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testNestedIFrameTitle() {
		NestedFrames frame=alertFrame.goToNestedFrame();
		String actual=frame.getTitle();
		log.info("actual result : "+actual);
		String expected=Constants.NESTEDFRAMEPAGETITLE;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
}
