package com.pom.axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accounts_Page {
	public WebDriver driver;

	@FindBy(xpath = "//div[text()='ACCOUNTS']")
	private WebElement accounts;
	@FindBy(xpath="//div[@id='mat-tab-label-1-3']")
	private WebElement services;
	@FindBy(xpath = "//div[text()= 'LAST 10 TRANSACTIONS']")
	private WebElement lastTransactions;

	public Accounts_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAccounts() {
		return accounts;
	}
	
	public WebElement getServices() {
		return services;
	}

	public WebElement getLastTransactions() {
		return lastTransactions;
	}

}
