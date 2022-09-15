package com.demoQA.utility;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Calendar_Utility {
	static String newXpath;
	WebElement mon;
	WebElement yr;
	WebElement input;
	List<WebElement>list;
	WebElement next;
	WebElement prev;
	WebElement act;
	String actualtxt;
public String calendarSel_Yr(String xpath,String replaceWord) {
	newXpath=xpath.replace("year", replaceWord);
	return newXpath;
}
public String calendarSel_Mon(String xpath,String replaceWord) {
	newXpath=xpath.replace("month", replaceWord);
	return newXpath;
}
public String calendarSel_Date(String xpath,String replaceWord) {
	newXpath=xpath.replace("Replace", replaceWord);
	return newXpath;
}
public static String getMonth(int i) {
	String[]arr= {"January","February","March","April","May","June","July","August","September","October","November","December"};
	return arr[i-1];
}
public void elementCalendarUtility(WebElement year,WebElement month,WebElement input) {
	this.yr=year;
	this.mon=month;
//	List<WebElement>list=day;
	this.input=input;
}
public void  CalendarUtility(String year,String month) {
	Select selyr=new Select(yr);
	selyr.selectByVisibleText(year);
	Select selmon=new Select(mon);
	selmon.selectByVisibleText(month);
}
public void selCalElements(WebElement next,WebElement prev,WebElement actual) {
	this.next=next;
	this.prev=prev;
	this.act=actual;
}
public void calendarUtilityByPrevNextBtn(int year,int month) {
	String actual=act.getText();
	System.out.println("actual "+actual);
	Date date=new Date();
	Calendar cal=Calendar.getInstance();
	cal.setTime(date);
	int currentmonth=cal.get(Calendar.MONTH);
	int currentyr=cal.get(Calendar.YEAR);
	String expected=getMonth(month)+" "+year;
	System.out.println("expected "+expected);
	if(year<currentyr) {
		while(!actual.equals(expected)) {
			prev.click();
			actual=act.getText();
		}
	}
	else if(year==currentyr && month<currentmonth) {
		while(!actual.equals(expected)) {
			prev.click();
			actual=act.getText();
		}
	}
	else {
		while(!actual.equals(expected)) {
			next.click();
			actual=act.getText();
		}
	}
}
}
