package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.axis.Accounts_Page;
import com.pom.axis.App_Logout;
import com.pom.axis.Onboarding_Page;
import com.pom.axis.Push_Notification;

public class Page_Object_Manager {
	public WebDriver driver;
	private Onboarding_Page onboard;
	private Push_Notification notification;
	private Accounts_Page accounts;
	private App_Logout logout;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Onboarding_Page getOnboard() {
		onboard = new Onboarding_Page(driver);
		return onboard;
	}

	public Push_Notification getNotification() {
		notification = new Push_Notification(driver);
		return notification;
	}

	public Accounts_Page getAccounts() {
		accounts = new Accounts_Page(driver);
		return accounts;
	}

	public App_Logout getLogout() {
		logout = new App_Logout(driver);
		return logout;
	}

}
