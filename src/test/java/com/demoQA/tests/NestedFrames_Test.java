package com.demoQA.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA.Constants.Constants;
import com.demoQA.basetest.BaseClass;
import com.demoQA.page.Alert_Frame_Window_Page;
import com.demoQA.page.NestedFrames;

public class NestedFrames_Test extends BaseClass {
	static Logger log=LogManager.getLogger(NestedFrames_Test.class);
	NestedFrames frame;
@BeforeClass
public void beforeClass() {
	Alert_Frame_Window_Page alert=	home.goToAlert();
	frame=alert.goToNestedFrame();
}
@Test
public void verifyTitle() {
	String actual=frame.getTitle();
	log.info("actual result : "+actual);
	String expected=Constants.NESTEDFRAMEPAGETITLE;
	log.info("expected result : "+expected);
	Assert.assertEquals(actual, expected);
}
@Test(priority = 1)
public void verifyNestedFrame() {
	String actual=frame.switchToAlert();
	log.info("actual result : "+actual);
	String expected=Constants.NESTEDFRAMETEXT;
	log.info("expected result : "+expected);
	Assert.assertEquals(actual, expected);
}
}
