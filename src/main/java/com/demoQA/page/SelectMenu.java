package com.demoQA.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.demoQA.utility.DropDown_Utility;

public class SelectMenu {
	WebDriver driver;
	DropDown_Utility drop;
	//WebElements
	By title=By.xpath("//div[text()='Select Menu']");
	By selValue=By.xpath("//div[text()='Select Option']");
	String value_Options="//div[text()='Replace1']";
	By sel_One=By.xpath(" //div[text()='Select Title']");
	String selTitle=" //div[text()='Replace1']";
	By oldSelectMenu=By.id("oldSelectMenu");
	By multiselectdropdown=By.xpath(" //div[text()='Select...']");
	String multiselectOptions=" //div[text()='Blue']";
	public SelectMenu(WebDriver driver) {
		this.driver=driver;
	}
	//page Actions
	public String getTitle() {
		return driver.findElement(title).getText();
	}
	public String selectGroup(String group) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		driver.findElement(selValue).click();
		value_Options=" //div[text()='"+group+"']";
		driver.findElement(By.xpath(value_Options)).click();;
		return driver.findElement(selValue).getText();	
	}
	public String selectTitle(String title) {
		driver.findElement(sel_One).click();
		drop=new DropDown_Utility();
		String newxpath=drop.getReplaceXpath(selTitle, title);
		WebElement value=driver.findElement(By.xpath(newxpath));
		value.click();
		return driver.findElement(sel_One).getText();	
	}
	public String selectOldMenu(String menu) {
	WebElement selmenu=	driver.findElement(oldSelectMenu);
		Select sel=new Select(selmenu);
		sel.selectByVisibleText(menu);
		return driver.findElement(oldSelectMenu).getText();	
	}
}
