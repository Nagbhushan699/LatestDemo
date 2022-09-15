package com.demoQA.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Widgets {
WebDriver driver;
//WebElements
By title=By.xpath("//div[@class='pattern-backgound playgound-header']//div[text()='Widgets']");
By datepicker=By.xpath("//span[text()='Date Picker']");
By slider=By.xpath("//span[text()='Slider']");
By progressBar=By.xpath("//span[text()='Progress Bar']");
By toolTips=By.xpath("//span[text()='Tool Tips']");
By selectMenu=By.xpath("//span[text()='Select Menu']");
//initializing driver
public Widgets(WebDriver driver) {
	this.driver=driver;
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,400)");
}
//page Actions
public String getTitle() {
	return driver.findElement(title).getText();
}
public 	Datepicker goToDatePicker() {
	driver.findElement(datepicker).click();
	return new Datepicker(driver);
}

public 	ProgressBar goToProgressBar() {
	driver.findElement(progressBar).click();
	return new ProgressBar(driver);
}
public 	ToolTips goToToolTips() {
	driver.findElement(toolTips).click();
	return new ToolTips(driver);
}
public SelectMenu goToSelectMenu() {
	driver.findElement(selectMenu).click();
	return new SelectMenu(driver);
}
}

