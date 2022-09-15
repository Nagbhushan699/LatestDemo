package com.demoQA.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Interactions {
WebDriver driver;
//WebElememtns
By droppable=By.xpath("//span[text()='Droppable']");
By selectable=By.xpath("//span[text()='Selectable']");
By title=By.xpath("//div[@class='pattern-backgound playgound-header']//div[text()='Interactions']");
//driver initilize
public Interactions(WebDriver driver) {
	this.driver=driver;
}
//page actions
public Droppable goToDroppable() {
	WebElement drop=driver.findElement(droppable);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",drop);
	driver.findElement(droppable).click();
	return new Droppable(driver);
}
public Selectable goToSelectable() {
	driver.findElement(selectable).click();
	return new Selectable(driver);
}
public String checkTitle() {
	return driver.findElement(title).getText();
}
}
