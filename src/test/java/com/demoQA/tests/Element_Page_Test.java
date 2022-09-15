package com.demoQA.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.AssertJUnit;
import com.demoQA.Constants.Constants;
import com.demoQA.basetest.BaseClass;
import com.demoQA.page.CheckBox;
import com.demoQA.page.Elements;
import com.demoQA.page.RadioButtons;
import com.demoQA.page.TextBox;

public class Element_Page_Test extends BaseClass{
	static Logger log=LogManager.getLogger(Element_Page_Test.class);
	Elements element12;
	@BeforeClass
	public void before() {
		element12=home.goToElementsPage();
	}
	@Test
	public void testTextBox() {
		TextBox text=element12.goToTextBox();
		String actual=text.checkHeader();
		log.info("actual result : "+actual);
		String expected=Constants.TEXTBOXHEADER;
		log.info("expected result : "+expected);
		AssertJUnit.assertEquals(actual, expected);
	}
	@Test
	public void testCheckBox() {
		CheckBox check=	element12.goToCheckBox();
		String actual=check.checkHeaderText();
		log.info("actual result : "+actual);
		String expected=Constants.CHECKBOXHEADER;
		log.info("expected result : "+expected);
		AssertJUnit.assertEquals(actual, expected);
	}
	@Test
	public void testRadioButtons() {
		RadioButtons radio=	element12.goRadioButtons();
		String actual=radio.checkHeaderTxt();
		log.info("actual result : "+actual);
		String expected=Constants.RADIOBUTTONHEADER;
		log.info("expected result : "+expected);
		AssertJUnit.assertEquals(actual, expected);
	}
}
