package com.demoQA.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {
WebDriver driver;
//WebElements
By title=By.xpath("//div[text()='Alerts']");
By alertbtn=By.xpath("//button[@id='alertButton']");
By timerAlert=By.xpath("//button[@id='timerAlertButton']");
By confirmAlert=By.xpath("//button[@id='confirmButton']");
By promptAlert=By.xpath("//button[@id='promtButton']");
By confirmTextSuceesMsg=By.xpath("//span[@id='confirmResult']");
By promptTextSuceesMsg=By.xpath("//span[@id='promptResult']");
//driver initilizing
public Alerts(WebDriver driver) {
	this.driver=driver;
}
//page Actions
public String getTitle() {
	return driver.findElement(title).getText();
}
public void clickAlert() {
	driver.findElement(alertbtn).click();
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alert=driver.switchTo().alert();
	alert.accept();
}
public void clicktimerAlert() {
	driver.findElement(timerAlert).click();
	WebDriverWait wait=new WebDriverWait(driver,5);
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alert=driver.switchTo().alert();
	alert.accept();
}
public String clickConfirmAlert() {
	driver.findElement(confirmAlert).click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
	String msg=driver.findElement(confirmTextSuceesMsg).getText();
	return msg;
}
public String clickPromptAlert() {
	driver.findElement(promptAlert).click();
	Alert alert=driver.switchTo().alert();
	alert.sendKeys("I am Nagbhushan");
	alert.accept();
	return driver.findElement(promptTextSuceesMsg).getText();
}
}
