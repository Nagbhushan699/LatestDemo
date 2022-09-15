package com.demoQA.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFrames {
WebDriver driver;
//WebElements
By title=By.xpath("//div[text()='Nested Frames']");
By frame1=By.id("frame1");
By childFrameTxt=By.xpath("//p[text()='Child Iframe']");
//initilizing driver
public NestedFrames(WebDriver driver) {
	this.driver=driver;
}
//page Actions
public String getTitle() {
	return driver.findElement(title).getText();
}
public String switchToAlert() {
	WebElement frame=driver.findElement(frame1);
	driver.switchTo().frame(frame);
	driver.switchTo().frame(0);
	return driver.findElement(childFrameTxt).getText();
}
}
