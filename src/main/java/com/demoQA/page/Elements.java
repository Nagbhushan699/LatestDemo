package com.demoQA.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elements {
WebDriver driver;
//webElements
By title=By.xpath("//div[text()='Elements']");
private By textBox=By.xpath("//span[text()='Text Box']");
private By checkBox=By.xpath("//span[text()='Check Box']");
private By radioButtons=By.xpath("//span[text()='Radio Button']");
//driver initializtion
public Elements(WebDriver driver) {
	this.driver=driver;
}
//page Actions
public TextBox goToTextBox() {
	driver.findElement(textBox).click();
	return new TextBox(driver);
}
public CheckBox goToCheckBox() {
	driver.findElement(checkBox).click();
	return new CheckBox(driver);
}
public RadioButtons goRadioButtons() {
	driver.findElement(radioButtons).click();
	return new RadioButtons(driver);
}
public String checkTitle() {
	return driver.findElement(title).getText();
}


}
