package com.pom.axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Push_Notification {
	public WebDriver driver;
	@FindBy(xpath = "//button[@class='No thanks']")
	private WebElement notification;

	public Push_Notification(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getNotification() {
		return notification;
	}
}
