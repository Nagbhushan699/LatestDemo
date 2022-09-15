package com.demoQA.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA.Constants.Constants;
import com.demoQA.basetest.BaseClass;
import com.demoQA.page.Datepicker;
import com.demoQA.page.ProgressBar;
import com.demoQA.page.Widgets;

public class Widgets_Test extends BaseClass{
	static Logger log=LogManager.getLogger(Widgets_Test.class);
	Widgets widget;
	@BeforeClass
	public void beforeclass() {
		widget=	home.goToWidgets();
	}
	@Test
	public void getTitle() {
		String actual=	widget.getTitle();
		log.info("actual result : "+actual);
		String expected=Constants.WIDGETSTITLE;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void getTitleOFDatepicker() {
	Datepicker date=	widget.goToDatePicker();
	String actual=date.getTitle();
	String expected=Constants.DATEPICKERTITLE;
	Assert.assertEquals(actual, expected);
	}
	@Test
	public void getTitleOFProgressBar() {
	ProgressBar prog=	widget.goToProgressBar();
	String actual=prog.getTitle();
	log.info("actual result : "+actual);
	String expected=Constants.PROGRESSBARSTITLE;
	log.info("expected result : "+expected);
	Assert.assertEquals(actual, expected);
	}
}
