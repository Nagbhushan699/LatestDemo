package com.demoQA.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Droppable {
	WebDriver driver;
	//WebElements
	By drag=By.xpath("//div[@id='draggable']");
	By drop=By.xpath("//div[@id='simpleDropContainer']//p[text()='Drop here']");
	By title=By.xpath("//div[text()='Droppable']");
	By Acceptlin=By.xpath("//a[@id='droppableExample-tab-accept']");
	By acceptdrag=By.xpath("//div[@id='acceptable']");
	By acceptdrop=By.xpath("//div[@id='acceptDropContainer']//p[text()='Drop here']");
	By notaccept=By.xpath("//div[@id='notAcceptable']");
	//initilize driver
	public Droppable(WebDriver driver) {
		this.driver=driver;
	}
	//page Actions
	public String getTitle() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement title12=	driver.findElement(title);
    js.executeScript("arguments[0].scrollIntoView(true);", title12);
		return driver.findElement(title).getText();
	}
	public String performDragDrop() throws InterruptedException {
		driver.navigate().refresh();
		WebElement src=	driver.findElement(drag);
		WebElement droptxt1=driver.findElement(drop);
		Actions act=new Actions(driver);
	     act.dragAndDrop(src, droptxt1).perform();
		return droptxt1.getText();
	}
	public String performAcceptableDragDrop(){
		driver.findElement(Acceptlin).click();
		WebElement src=driver.findElement(acceptdrag);
		WebElement dest=driver.findElement(acceptdrop);
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		return dest.getText();
	}
	public String performNotAcceptableDragDrop() {
		driver.findElement(Acceptlin).click();
		WebElement src=driver.findElement(notaccept);
		WebElement dest=driver.findElement(acceptdrop);
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		return dest.getText();
	}
}
