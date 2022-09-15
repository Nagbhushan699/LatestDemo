package com.demoQA.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alert_Frame_Window_Page {
	WebDriver driver;
	By title=By.xpath("//div[@class='pattern-backgound playgound-header']//div[text()='Alerts, Frame & Windows']");
	By browserWindow=By.xpath("//span[text()='Browser Windows']");
	By alerts=By.xpath("//span[text()='Alerts']");
	By frame=By.xpath("//span[text()='Frames']");
	By nested_Frame=By.xpath("//span[text()='Nested Frames']");
	//driver Initialization
	public Alert_Frame_Window_Page(WebDriver driver) {
		this.driver=driver;
	}
	//page Actions
	public String getTitle() {
		return driver.findElement(title).getText();
	}
	public Alerts goToAlerts() {
		driver.findElement( alerts).click();
		return new  Alerts(driver);
	}
	public Browser_Windows goToBrowserWindow() {
		driver.findElement(browserWindow).click();
		return new Browser_Windows(driver);
	}
	public Frame goToFrame() {
		driver.findElement(frame).click();
		return new Frame(driver);
	}
	public NestedFrames goToNestedFrame() {
		driver.findElement(nested_Frame).click();
		return new NestedFrames(driver);
	}
}
