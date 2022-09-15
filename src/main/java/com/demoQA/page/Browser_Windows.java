package com.demoQA.page;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Browser_Windows {
	WebDriver driver;
	//WebElements
	By title=By.xpath("//div[text()='Browser Windows']");
	By tab=By.xpath("//button[@id='tabButton']");
	By tabText=By.xpath("//h1[text()='This is a sample page']");
	By window=By.xpath("//button[@id='messageWindowButton']");
	By windowText=By.xpath("//body[contains(text(),'Knowledge increases by sharing but not by saving')] ");

	public Browser_Windows(WebDriver driver) {
		this.driver=driver;
	}
	//page Actions
	public String getTitle() {
		return driver.findElement(title).getText();
	}
	public String switchToNewTab() {
		String text=" ";
		String parentWindow=driver.getWindowHandle();
		driver.findElement(tab).click();
		Set<String>allWindow=driver.getWindowHandles();
		Iterator<String>itr=allWindow.iterator();
		while(itr.hasNext()) {
			String child=itr.next();
			if(!child.equals(parentWindow)) {
				driver.switchTo().window(child);
				driver.manage().window().maximize();
				System.out.println("hi");
				text=driver.findElement(tabText).getText();
				
			}
			driver.switchTo().window(parentWindow);
		}
		return text;
	}
	public String switchToNewWindows() {
		String text=" ";
		String parentWindow=driver.getWindowHandle();
		driver.findElement(window).click();
		Set<String>all= driver.getWindowHandles();
		Iterator<String>itr=all.iterator();
		while(itr.hasNext()) {
			String child=itr.next();
			if(!child.equals(parentWindow)) {
				driver.switchTo().window(child);
				driver.manage().window().maximize();
				System.out.println("hello");
				text=driver.findElement(windowText).getText();
				driver.switchTo().window(parentWindow);
			}
	}
		return text;
}
}
