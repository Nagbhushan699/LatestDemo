package com.demoQA.driverfactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demoQA.utility.ExcelReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public static ThreadLocal<WebDriver>tdriver=new ThreadLocal<WebDriver>();
WebDriver driver;
public WebDriver int_driver() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
}

}
