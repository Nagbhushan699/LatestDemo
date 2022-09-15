package com.demoQA.tests;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demoQA.Constants.Constants;
import com.demoQA.basetest.BaseClass;
import com.demoQA.page.Datepicker;
import com.demoQA.page.Widgets;
import com.demoQA.utility.ExcelReader;

public class Datepicker_Test extends BaseClass{
	static Logger log=LogManager.getLogger(Datepicker_Test.class);
	Datepicker date;
	@BeforeClass
	public void beforeclass() {
		Widgets wid=home.goToWidgets();
		date=wid.goToDatePicker();
	}
	@Test
	public void verifyTitle() {
		String actual=	date.getTitle();
		log.info("actual result : "+actual);
		String expected=Constants.DATEPICKERTITLE;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test(dataProvider = "data")
	public void verifyDate() throws InterruptedException {
		String actual=	date.selectDate("2023","3", "23");
		log.info("actual result : "+actual);
		String expected=Constants.EXPECTEDDATE;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@DataProvider
	public Object[][] data() throws IOException{
		String path=System.getProperty("user.dir");
		String fullpath=path+File.separator+"src\\main\\resources\\Excel_Files"+File.separator+"TestCases.xlsx";
		String sheetName="Calendar_Dates";
		ExcelReader excel=new ExcelReader(fullpath,sheetName);
		return excel.getAllData();
	}
	@Test(dataProvider = "dp2")
	public void verifyDateByPrevNextBtn(int yr,int mon,int day){
		String actual=	date.selectDateByPrevNextBtn(yr, mon,day);
		log.info("actual result : "+actual);
		String expected=Constants.EXPECTEDDATE;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@DataProvider
	public Object[][] dp2() throws IOException{
		String path=System.getProperty("user.dir");
		String fullpath=path+File.separator+"src\\main\\resources\\Excel_Files"+File.separator+"Dates_Provider.xlsx";
		String sheetName="Sheet1";
		ExcelReader excel=new ExcelReader(fullpath,sheetName);
		return excel.getAllData();
	}
	@Test
	public void verifyDateAndTime() throws InterruptedException {
		String actual=	date.selectDateAndTime(2019, 5,16,"11:30");
		log.info("actual result : "+actual);
		String expected=Constants.EXPECTEDDATETIME;
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
}
