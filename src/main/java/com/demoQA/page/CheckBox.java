package com.demoQA.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {
WebDriver driver;
//WebElements
By home=By.xpath("//span[text()='Home']");
By header=By.xpath("//div[text()='Check Box']");
By checkbox=By.xpath("//span[text()='Home']/preceding::span[@class='rct-checkbox']");
//driver initialization
public CheckBox(WebDriver driver) {
	this.driver=driver;
}
//page Actions
public String checkHeaderText() {
	WebElement headerTxt=driver.findElement(header);
	String txt=headerTxt.getText();
	return txt;
}
public String checkHomeTxt() {
	WebElement homeTxt=driver.findElement(home);
	String txt=homeTxt.getText();
	return txt;
}
public boolean selectHomeCheckBox() throws InterruptedException {
	driver.findElement(home).click();
	Thread.sleep(5000);
	WebElement ele=driver.findElement(checkbox);
	boolean isClick=ele.isSelected();
	return isClick;
}
}
