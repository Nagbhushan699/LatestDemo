package com.demoQA.tests;

import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA.Constants.Constants;
import com.demoQA.basetest.BaseClass;
import com.demoQA.page.Alert_Frame_Window_Page;
import com.demoQA.page.Frame;

public class Frame_Test extends BaseClass {
	static org.apache.logging.log4j.Logger log=LogManager.getLogger(Frame_Test.class);
	Frame frame;
	@BeforeClass
	public void beforeClass() {
		Alert_Frame_Window_Page alert=	home.goToAlert();
		frame=alert.goToFrame();
	}
	@Test()
	public void verifyTitle() {
		String actual=frame.getTitle();
		log.info("actual result : "+actual);
		String expected=Constants.FRAMEPAGETITLE;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual,expected);
	}
	@Test(priority = 1)
	public void testFrame() {
		String actual=	frame.switchToFrame();
		log.info("actual result : "+actual);
		String expected=Constants.FRAMETEXT;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual,expected);
	}
}
