package com.demoQA.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtons {
WebDriver driver;
//WebElements
By header=By.xpath("//div[text()='Radio Button']");
By yes=By.xpath("//label[text()='Yes']");
By yes_Txt=By.xpath("//span[text()='Yes']");
By impressive=By.xpath("//label[text()='Impressive']");
By impressive_Txt=By.xpath("//span[@class='text-success']");
By no=By.xpath("//label[text()='No']");
//driver Initlization
public RadioButtons(WebDriver driver) {
	this.driver=driver;
}
public String checkHeaderTxt() {
	WebElement headertxt=driver.findElement(header);
	String txt=headertxt.getText();
	return txt;
}
public String clickYesBtn() {
	driver.findElement(yes).click();
	return driver.findElement(yes_Txt).getText();
}
public String clickImpressiveBtn() {
	driver.findElement(impressive).click();
	return driver.findElement(impressive_Txt).getText();
}
}
