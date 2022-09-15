package com.demoQA.tests;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
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
import com.demoQA.page.ToolTips;
import com.demoQA.page.Widgets;

public class ToolTip_Test extends BaseClass {
	static Logger log=LogManager.getLogger(ToolTip_Test.class);
	ToolTips tip;
	@BeforeClass
	public void beforeclass() {
		Widgets widget=home.goToWidgets();
		tip=widget.goToToolTips();
	}
	@Test
	public void verifyTitle() {
		String actual=tip.getTitle();
		log.info("Actual Result : "+actual);
		String expected=Constants.TOOLTIPSTITLE;
		log.info("expected Result : "+expected);
		AssertJUnit.assertEquals(actual, expected);
	}
	@Test
	public void verifyHoverText() {
		String actual=tip.hoverOnText();
		log.info("Actual Result : "+actual);
		String expected=Constants.EXPECTEDHOVERTEXT;
		log.info("expected Result : "+expected);
		AssertJUnit.assertEquals(actual, expected);
	}
	@Test
	public void verifyHoverFieldText() {
		String actual=tip.hoverOnTextField();
		log.info("Actual Result : "+actual);
		String expected=Constants.EXPECTEDHOVERFIELDTEXT;
		log.info("expected Result : "+expected);
		AssertJUnit.assertEquals(actual, expected);
	}
	@Test
	public void verifyEnterText() {
		String actual=tip.enterOnTextField("Nagbhushan");
		log.info("Actual Result : "+actual);
		String expected=Constants.EXPECTETIPINPUTTEXT;
		log.info("expected Result : "+expected);
		AssertJUnit.assertEquals(actual, expected);
	}
}
