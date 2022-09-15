package com.demoQA.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.File;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.demoQA.Constants.Constants;
import com.demoQA.basetest.BaseClass;
import com.demoQA.page.Elements;
import com.demoQA.page.TextBox;
import com.demoQA.utility.ExcelReader;
public class TextBox_Test extends BaseClass{
	static Logger log=LogManager.getLogger(TextBox_Test.class);
	TextBox text;
	@BeforeClass
	public void before() {
		Elements ele=	home.goToElementsPage();
		text=ele.goToTextBox();
	}
	@Test(dataProvider = "dp")
	public void testFullName(String s1,String s2,String s3,String s4,String s5,String s6) {
		String actual=	text.enterFullName(s1);
		log.info("actual result : "+actual);
		String expected=Constants.FullNAME;
		log.info("expected result : "+expected);
		AssertJUnit.assertEquals(actual, expected);
	}
	@DataProvider
	public Object[][] dp() throws IOException{
		String path=System.getProperty("user.dir");
		String fullpath=path+File.separator+"src\\main\\resources\\Excel_Files"+File.separator+"TestCases.xlsx";
		String sheetname="Sheet1";
		ExcelReader excel=new ExcelReader(fullpath,sheetname);
		return excel.getAllData();
	}
	@Test(dataProvider = "dp2")
	public void testEmail(String s1,String s2,String s3,String s4,String s5,String s6) {
		String actual=text.enterEmail(s2);
		log.info("actual result : "+actual);
		String expected=Constants.EMAIL;
		log.info("expected result : "+expected);
		AssertJUnit.assertEquals(actual, expected);
	}
	@DataProvider()
	public Object[][]dp2() throws IOException{
		String path=System.getProperty("user.dir");
		String fullpath=path+File.separator+"\\src\\main\\resources\\Excel_Files"+File.separator+"TestCases.xlsx";
		String sheetname="Sheet1";
		ExcelReader excel=new ExcelReader(fullpath,sheetname);
		return excel.getAllData();
	}
	@Test(dataProvider = "dp3")
	public void testCurrentAdd(String s1,String s2,String s3,String s4,String s5,String s6) {
		String actual=	text.enterCurrentAdd(s3);
		log.info("actual result : "+actual);
		String expected=Constants.CURRENT_ADD;
		log.info("expected result : "+expected);
		AssertJUnit.assertEquals(actual, expected);
	}
	@DataProvider()
	public Object[][]dp3() throws IOException{
		String path=System.getProperty("user.dir");
		String fullpath=path+File.separator+"\\src\\main\\resources\\Excel_Files"+File.separator+"TestCases.xlsx";
		String sheetname="Sheet1";
		ExcelReader excel=new ExcelReader(fullpath,sheetname);
		return excel.getAllData();
	}
}
