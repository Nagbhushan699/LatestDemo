package com.demoQA.driverfactory;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demoQA.utility.ExcelReader;

public class Sample {
@Test(dataProvider = "dp1")
public void m1(double s1,double s2,double s3) {
	int yr=(int)s3;
	int day=(int)s1;
	int mon=(int)s2;
	System.out.println(yr+" "+day+" "+mon);
}
@DataProvider()
public Object[][] dp1() throws IOException {
	String path=System.getProperty("user.dir");
	String fullPath=path+File.separator+"src\\main\\resources\\Excel_Files"+File.separator+"Dates_Provider.xlsx";
	String sheetName="Sheet1";
	ExcelReader excel=new ExcelReader(fullPath,sheetName);
	return excel.getAllData();
}
}
