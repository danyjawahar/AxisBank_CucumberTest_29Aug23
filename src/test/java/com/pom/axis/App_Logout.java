package com.pom.axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class App_Logout {
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@id='LOGOUT']")
	private WebElement logout;
	@FindBy(xpath = "//button[@id='popup_ok0']")
	private WebElement accept;

	public App_Logout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getAccept() {
		return accept;
	}

}
