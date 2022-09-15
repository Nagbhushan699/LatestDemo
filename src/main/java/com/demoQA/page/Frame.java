package com.demoQA.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame {
WebDriver driver;
//WebElements
By title=By.xpath("//div[text()='Frames']");
By frame=By.xpath("//iframe[@id='frame1']");
By text=By.xpath("//h1[text()='This is a sample page']");
//initilizing driver
public Frame(WebDriver driver) {
	this.driver=driver;
}
//page Actions
public String getTitle() {
	return driver.findElement(title).getText();
}
public String switchToFrame() {
	WebElement frame1=driver.findElement(frame);
	driver.switchTo().frame(frame1);
	return driver.findElement(text).getText();
}
}
