package com.demoQA.Constants;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demoQA.utility.ExcelReader;

public class Excel {
	@Test(dataProvider = "dp1")
	public void test1(String s1,String s2,String s3) {
		System.out.println(s1+" "+s2+" "+s3);
	}
	@DataProvider
	public Object[][] dp1() throws IOException {
	String path=System.getProperty("user.dir");
	System.out.println(path);
	String fullpath=path+File.separator+"src\\main\\resources\\Excel_Files"+File.separator+"Dates_Provider.xlsx";
	System.out.println(fullpath);
	String sheetName="Sheet1";
	ExcelReader excel=new ExcelReader(fullpath,sheetName);
	return excel.getAllData();
	}
//	@Test
//	public void m1() throws IOException {
//		String path=System.getProperty("user.dir");
//		System.out.println(path);
//		String fullPath=path+File.separator+"src\\main\\resources\\Excel_Files"+File.separator+"Dates_Provider.xlsx";
//		System.out.println(fullPath);
//		String sheetName="Sheet1";
//		ExcelReader excel=new ExcelReader(fullPath,sheetName);
//		Object[][] ob=excel.getAllData();
//		for (int i = 0; i < ob.length; i++) {
//			System.out.println(ob[0]+" "+ob[1]+" "+ob[2]);
//			System.out.println(ob[0]+" "+ob[1]+" "+ob[2]);
//		}
//	}
}

