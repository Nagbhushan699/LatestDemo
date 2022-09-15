package com.demoQA.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA.Constants.Constants;
import com.demoQA.basetest.BaseClass;
import com.demoQA.page.ProgressBar;
import com.demoQA.page.Widgets;

public class ProgressBar_Test extends BaseClass {
	static Logger log=LogManager.getLogger(ProgressBar_Test.class);
	ProgressBar bar;
	@BeforeClass
	public void beforeclass() {
		Widgets widg=	home.goToWidgets();
		bar=widg.goToProgressBar();
	}
	@Test
	public void verifyTitle() {
		String actual=bar.getTitle();
		log.info("actual result : "+actual);
		String expected=Constants.PROGRESSBARSTITLE;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void verifyProgressBar() {
		String actual=	bar.handleProgressBar("70");
		log.info("actual result : "+actual);
		String expected=Constants.EXPECTEDPROGRESSBARTEXT;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
}
