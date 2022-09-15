package com.demoQA.tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demoQA.Constants.Constants;
import com.demoQA.basetest.BaseClass;
import com.demoQA.page.SelectMenu;
import com.demoQA.page.Widgets;
import com.demoQA.utility.ExcelReader;

public class SelectMenu_Test extends BaseClass{
	SelectMenu menu;
	@BeforeClass
	public void beforeclass() {
		Widgets widget=	home.goToWidgets();
		menu=widget.goToSelectMenu();
	}
	@Test
	public void verifyTitle() {
		String actual=	menu.getTitle();
		String expected=Constants.SELECTMENUTITLE;
		Assert.assertEquals(actual, expected);
	}
	@Test(dataProvider = "dp1")
	public void verifyGroups(String []s) {
		String actual=menu.selectGroup(s[3]);
		String expected=Constants.EXPECTEDSELECTGROUPS[1];
		Assert.assertEquals(actual, expected);
	}
	@DataProvider()
	public Object[][] dp1() throws IOException{
		String path=System.getProperty("user.dir");
		String fullpath=path+File.separator+"src\\main\\resources\\Excel_Files"+File.separator+"TestCases.xlsx";
		String sheetname="sheet1";
		ExcelReader excel=new ExcelReader(fullpath,sheetname);
		return excel.getAllData();
	}
	@Test(dataProvider = "dp2")
	public void verifyTitles(String []s) {
		String actual=menu.selectOldMenu(Constants.EXPECTEDTITLES[2]);
		String expected=Constants.EXPECTEDTITLES[2];
		Assert.assertEquals(actual, expected);
	}
	@DataProvider()
	public Object[][] dp2() throws IOException{
		String path=System.getProperty("user.dir");
		String fullpath=path+File.separator+"src\\main\\resources\\Excel_Files"+File.separator+"TestCases.xlsx";
		String sheetname="sheet1";
		ExcelReader excel=new ExcelReader(fullpath,sheetname);
		return excel.getAllData();
	}
	@Test(dataProvider = "dp3")
	public void verifyOldMenuItems(String s[]) {
		String actual=	menu.selectOldMenu(Constants.EXPECTEDTITLES[2]);
		String expected=Constants.EXPECTEDOLDMENU[2];
		Assert.assertEquals(actual, expected);
	}
	@DataProvider()
	public Object[][] dp3() throws IOException{
		String path=System.getProperty("user.dir");
		String fullpath=path+File.separator+"src\\main\\resources\\Excel_Files"+File.separator+"TestCases.xlsx";
		String sheetname="sheet1";
		ExcelReader excel=new ExcelReader(fullpath,sheetname);
		return excel.getAllData();
	}
}
