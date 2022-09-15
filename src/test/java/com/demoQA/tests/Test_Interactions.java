package com.demoQA.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.demoQA.Constants.Constants;
import com.demoQA.basetest.BaseClass;
import com.demoQA.page.Droppable;
import com.demoQA.page.Interactions;

public class Test_Interactions extends BaseClass{
	static Logger log=LogManager.getLogger(Test_Interactions.class);
	Interactions act;
@BeforeClass
public void beforeclass() {
act=home.goToInteractionsPage();
}
@Test
public void verifyTitle() {
	String actual=act.checkTitle();
	log.info("actual result : "+actual);
	String expected=Constants.INTERACTIONSTITLE;
	log.info("expected result : "+expected);
	Assert.assertEquals(actual, expected);
}
@Test
public void verifyDroppableTitle() {
	Droppable drop=act.goToDroppable();
	String actual=drop.getTitle();
	log.info("actual result : "+actual);
	String expected=Constants.DROPPABLETITLE;
	log.info("expected result : "+expected);
	Assert.assertEquals(actual, expected);
}
}
