package com.demoQA.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ProgressBar {
	WebDriver driver;
	//WebElement
	By title=By.xpath("//div[@class='pattern-backgound playgound-header']//div[text()='Progress Bar']");
	By startstopbtn=By.id("startStopButton");
	By progressbar=By.xpath("//div[@id='progressBar']");
	public ProgressBar(WebDriver driver) {
		this.driver=driver;
	}
	//page Actions
	public String getTitle() {
		return driver.findElement(title).getText();
	}
	public String handleProgressBar(String text) {
		WebElement startbtn=driver.findElement(startstopbtn);
		startbtn.click();
		WebElement progress=driver.findElement(progressbar);
		 Wait<WebDriver>wait = new FluentWait<WebDriver>(driver)
			        .withTimeout(30,TimeUnit.SECONDS)
			        .pollingEvery(5, TimeUnit.MILLISECONDS);
			        //.ignoring(NoSuchElementException.class);
			    
			    wait.until(ExpectedConditions.textToBePresentInElement(progress,text));
			    startbtn.click();  
		return driver.findElement(progressbar).getText();
	}
}
