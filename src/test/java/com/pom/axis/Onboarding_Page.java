package com.pom.axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Onboarding_Page {
	public WebDriver driver;
//Collecting webelements in Pre Onboarding page
//Login Options	
	@FindBy(xpath = "//div[@id='mat-tab-label-0-2']")
	private WebElement MPIN;
	@FindBy(xpath = "//input[@id='custId']")
	private WebElement custID;
	@FindBy(xpath = "//input[@id='mPin']")
	private WebElement mpin;
	@FindBy(xpath = "//button[@id='APLOGIN']")
	private WebElement login;

//Assigning runner class driver to this driver
	public Onboarding_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMPIN() {
		return MPIN;
	}

	public WebElement getCustID() {
		return custID;
	}

	public WebElement getMpin() {
		return mpin;
	}

	public WebElement getLogin() {
		return login;
	}

}
