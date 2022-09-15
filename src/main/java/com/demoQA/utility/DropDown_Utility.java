package com.demoQA.utility;

import com.demoQA.Constants.Constants;

public class DropDown_Utility {
	String newXpath;
	public String getReplaceXpath(String xpath,String replaceWord) {
		newXpath=xpath.replace("Replace1", replaceWord);
		return newXpath;
	}
	public String getUserRole(String xpath,String replaceword) {
		newXpath=xpath.replace("role",Constants.USER_ROLE[0]);
		return newXpath;
	}
	public String getAdminStatus(String xpath,String replaceword) {
		newXpath=xpath.replace("admin",Constants.USER_ROLE[0]);
		return newXpath;
	}
}
