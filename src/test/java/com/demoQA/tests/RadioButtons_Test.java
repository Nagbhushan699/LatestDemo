package com.demoQA.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA.Constants.Constants;
import com.demoQA.basetest.BaseClass;
import com.demoQA.page.Elements;
import com.demoQA.page.RadioButtons;

public class RadioButtons_Test extends BaseClass{
	static Logger log=LogManager.getLogger(RadioButtons_Test.class);
	RadioButtons radio;
	@BeforeClass
	public void before() {
		Elements ele=	home.goToElementsPage();
		radio=ele.goRadioButtons();
	}
	@Test
	public void testHeaderTxt() {
		String actual=	radio.checkHeaderTxt();
		log.info("actual result : "+actual);
		String expected=Constants.RADIOBUTTONS;
		log.info("expected result : "+expected);
		AssertJUnit.assertEquals(actual, expected);
	}
	@Test
	public void testYesBtn() {
		String actual=radio.clickYesBtn();
		log.info("actual result : "+actual);
		String expected=Constants.YESTEXT;
		log.info("expected result : "+expected);
		AssertJUnit.assertEquals(actual, expected);
	}
	@Test
	public void testImpressiveBtn() {
		String actual=radio.clickImpressiveBtn();
		log.info("actual result : "+actual);
		String expected=Constants.IMPRESSIVETEXT;
		log.info("expected result : "+expected);
		AssertJUnit.assertEquals(actual, expected);
	}
}

