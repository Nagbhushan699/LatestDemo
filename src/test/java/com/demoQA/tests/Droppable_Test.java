package com.demoQA.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA.Constants.Constants;
import com.demoQA.basetest.BaseClass;
import com.demoQA.page.Droppable;
import com.demoQA.page.Interactions;

public class Droppable_Test extends BaseClass{
	static Logger log=LogManager.getLogger(Droppable_Test.class);
	Droppable drop;
	@BeforeClass
	public void beforeclass() {
		Interactions act=	home.goToInteractionsPage();
		drop=act.goToDroppable();
	}
	@Test
	public void verifyTitle() {
		String actual=drop.getTitle();
		log.info("actual result : "+actual);
		String expected=Constants.DROPPABLETITLE;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void verifyDragDrop() throws InterruptedException {
		String actual=drop.performDragDrop();
		log.info("actual result : "+actual);
		String expected=Constants.EXPECTEDROPTEXT;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void verifyAccepatbleDragDrop() {
		String actual=drop.performAcceptableDragDrop();
		log.info("actual result : "+actual);
		String expected=Constants.EXPECTEDROPTEXT;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test(priority = 1)
	public void verifyNotAccepatbleDragDrop() {
		String actual=drop.performNotAcceptableDragDrop();
		log.info("actual result : "+actual);
		String expected=Constants.EXPECTEDNOTACCEPTABLEROPTEXT;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
}
