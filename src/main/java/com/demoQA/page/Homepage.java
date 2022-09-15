package com.demoQA.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
WebDriver driver;
//WebElements
private By elements=By.xpath("//h5[text()='Elements']/preceding::*[1]");
 private By forms=By.xpath("//h5[text()='Forms']");
private By alerts_frame_windows=By.xpath("//h5[starts-with(text(),'Alerts')]");
private By widgets=By.xpath("//h5[text()='Widgets']");
private By interaction=By.xpath("//h5[text()='Interactions']");
//driver intilization
public Homepage(WebDriver driver) {
	this.driver=driver;
}
//page Actions
public Elements goToElementsPage() {
	driver.findElement(elements).click();
	System.out.println("click");
	return new Elements(driver);
}
public Interactions goToInteractionsPage() {
	driver.findElement(interaction).click();
	return new Interactions(driver);
}
public Alert_Frame_Window_Page goToAlert() {
	driver.findElement(alerts_frame_windows).click();
	return new Alert_Frame_Window_Page(driver);
}
public Widgets goToWidgets() {
	driver.findElement(widgets).click();
	return new Widgets(driver);
}
}
