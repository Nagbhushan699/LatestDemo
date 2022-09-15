package com.demoQA.basetest;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.demoQA.driverfactory.DriverFactory;
import com.demoQA.page.Homepage;
import com.demoQA.utility.ConfigProperties;
import com.orangeHrm.utility.Screenshot_Utility;
public class BaseClass {
protected WebDriver driver;
DriverFactory df;
Properties prop;
protected Homepage home;
@BeforeTest
public void beforetest() throws IOException {
	df=new DriverFactory();
	driver=df.int_driver();
	prop=ConfigProperties.loadProperties("Uat");
	driver.get(prop.getProperty("baseUrl"));
	home=new Homepage(driver);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)"," ");
}
@AfterTest
public void after() {
	driver.quit();
}
@AfterMethod
public void afterMethod(ITestResult result) throws IOException {
	if(result.getStatus()==ITestResult.FAILURE) {
		com.demoQA.utility.Screenshot_Utility.takesScreenshot(driver, result.getMethod().getMethodName());
	}
}
}
