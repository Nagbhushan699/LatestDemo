package com.demoQA.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA.Constants.Constants;
import com.demoQA.basetest.BaseClass;
import com.demoQA.page.Alert_Frame_Window_Page;
import com.demoQA.page.Browser_Windows;

public class Browsers_Windows_Test extends BaseClass{
	static Logger log=LogManager.getLogger(Browsers_Windows_Test.class);
	Browser_Windows windows;
	@BeforeClass
	public void beforeClass() {
		Alert_Frame_Window_Page alert=	home.goToAlert();
		windows=alert.goToBrowserWindow();
	}
	@Test
	public void verifyTitle() {
		String actual=	windows.getTitle();
		log.info("actual result : "+actual);
		String expected=Constants.BROWSERWINDOWTITLE;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test(priority = 1)
	public void verifyNewTab() {
		String actual=windows.switchToNewTab();
		log.info("actual result : "+actual);
		String expected=Constants.TABTEXT;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test(priority = 2)
	public void verifyNewWindow() {
		String actual=windows.switchToNewWindows();
		log.info("actual result : "+actual);
		String expected=Constants.WINDOWTEXT;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
}
