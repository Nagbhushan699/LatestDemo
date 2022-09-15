package com.demoQA.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ToolTips {
WebDriver driver;
//WebElement
By title=By.xpath("//div[text()='Tool Tips']");
By tooltip1=By.id("toolTipButton");
By toolTipText=By.xpath("//div[text()='You hovered over the Button']");
By textField=By.id("toolTipTextField");
By tooltipText2=By.xpath("//div[text()='You hovered over the text field']");
public ToolTips(WebDriver driver) {
	this.driver=driver;
}
//page Actions
public String getTitle() {
	return driver.findElement(title).getText();
}
public String hoverOnText() {
	WebElement ele=driver.findElement(tooltip1);
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	return driver.findElement(toolTipText).getText();
}
public String hoverOnTextField() {
	WebElement ele=driver.findElement(textField);
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	return driver.findElement(tooltipText2).getText();
}
public String enterOnTextField(String name) {
	WebElement ele=driver.findElement(textField);
	ele.sendKeys(name);
	return ele.getAttribute("value");
}
}
