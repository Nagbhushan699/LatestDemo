package com.demoQA.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demoQA.utility.Calendar_Utility;

public class Datepicker {
	Calendar_Utility cal;
	WebDriver driver;
	//WebElements
	By title=By.xpath("//div[text()='Date Picker']");
	By selDateInput=By.id("datePickerMonthYearInput");
	By selMonth=By.className("react-datepicker__month-select");
	By selYear=By.className("react-datepicker__year-select");
	By prevbtn=By.xpath("//button[text()='Previous Month']");
	By nextbtn=By.xpath("//button[text()='Next Month']");
	By headertxt=By.xpath("//div[contains(@class,'react-datepicker__current-month--hasMonthDropdown')]");
	String dt="//div[text()='18']";
	By selDateTime=By.id("dateAndTimePickerInput");
	String time="//li[@class='react-datepicker__time-list-item ' and text()='05:45']";
	public Datepicker(WebDriver driver) {
		this.driver=driver;
	}
	//page Actions
	public String getTitle() {
		return driver.findElement(title).getText();
	}
	public String selectDate(String year,String month,String day) throws InterruptedException {
		driver.navigate().refresh();
		driver.findElement(selDateInput).click();
		WebElement yr=driver.findElement(selYear);
		WebElement mon=driver.findElement(selMonth);
		WebElement selDate=driver.findElement(selDateInput);
		cal=new Calendar_Utility();
		cal.elementCalendarUtility(yr, mon,selDate);
		dt="//div[text()='"+day+"']";
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		cal.CalendarUtility(year,month);
		driver.findElement(By.xpath(dt)).click();
		return driver.findElement(selDateInput).getAttribute("value");
	}
	public String selectDateByPrevNextBtn(int year,int month,int day) {
		driver.findElement(selDateInput).click();
		WebElement next=driver.findElement(nextbtn);
		WebElement prev=driver.findElement(prevbtn);
		WebElement actual=driver.findElement(headertxt);
		cal=new Calendar_Utility();
		cal.selCalElements(next, prev, actual);
		cal.calendarUtilityByPrevNextBtn(year, month);
		dt="//div[text()='"+day+"']";
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath(dt)).click();
		return driver.findElement(selDateInput).getAttribute("value");
	}
	public String selectDateAndTime(int year,int month,int day,String time) {
		driver.findElement(selDateTime).click();
		WebElement next=driver.findElement(nextbtn);
		WebElement prev=driver.findElement(prevbtn);
		WebElement actual=driver.findElement(headertxt);
		cal=new Calendar_Utility();
		cal.selCalElements(next, prev, actual);
		cal.calendarUtilityByPrevNextBtn(year, month);
		dt="//div[text()='"+day+"']";
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath(dt)).click();
		time="//li[@class='react-datepicker__time-list-item ' and text()='"+time+"']";
		driver.findElement(By.xpath(time)).click();
		return driver.findElement(selDateTime).getAttribute("value");
	}
}
