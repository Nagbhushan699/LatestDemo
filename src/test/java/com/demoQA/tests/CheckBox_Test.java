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
import com.demoQA.page.CheckBox;
import com.demoQA.page.Elements;

public class CheckBox_Test extends BaseClass{
	static Logger log=LogManager.getLogger(CheckBox_Test.class);
	Elements ele;
	CheckBox checkbox;
	@BeforeClass
	public void before() {
		ele=home.goToElementsPage();
		checkbox=ele.goToCheckBox();
	}
	@Test
	public void testHeaderTxt() {
		String actual=	checkbox.checkHeaderText();
		log.info("actual result : "+actual);
		String expected=Constants.CHECKBOX;
		log.info("expected result : "+expected);
		AssertJUnit.assertEquals(actual, expected);
	}
	@Test
	public void testHomeTxt() {
		String actual=	checkbox.checkHomeTxt();
		log.info("actual result : "+actual);
		String expected=Constants.HOME;
		log.info("expected result : "+expected);
		AssertJUnit.assertEquals(actual, expected);
	}
	@Test
	public void testHomeCheckBox() throws InterruptedException {
		boolean actual=	checkbox.selectHomeCheckBox();
		AssertJUnit.assertTrue(actual);
	}
}
