package com.demoQA.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBox {
	WebDriver driver;
	//WebELEMENTS
	By header=By.xpath("//div[text()='Text Box']");
	By fullName=By.xpath("//input[@id='userName']");
	By emailAdd=By.xpath("//input[@id='userEmail']");
	By currentAddres=By.xpath("//textarea[@id='currentAddress']");
	//driver initilization
	public TextBox(WebDriver driver) {
		this.driver=driver;
	}
	//page Actions
	public String enterFullName(String name) {
		WebElement Fullname	=driver.findElement(fullName);
		Fullname.clear();
		Fullname.sendKeys(name);
		String text=Fullname.getAttribute("value");
		return text ;	
	}
	public String enterEmail(String email) {
		WebElement email12	=driver.findElement(emailAdd);
		email12.clear();
		email12.sendKeys(email);
		String text=email12.getAttribute("value");
		return text ;	
	}
	public String enterCurrentAdd(String add) {
		WebElement current	=driver.findElement(currentAddres);
		current.clear();
		current.sendKeys(add);
		String text=current.getAttribute("value");
		return text ;	
	}
	public String checkHeader() {

		return driver.findElement(header).getText() ;	
	}
}
