package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.pageobjectmanager.Page_Object_Manager;
import com.runner.AxisBank_Runner;
import com.selenium.axis_Utility_files.Utility_Files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AxisBank_Stepdef extends Utility_Files {
	public static WebDriver driver = AxisBank_Runner.driver;
	public static Page_Object_Manager manager = new Page_Object_Manager(driver);

	@Given("user Launch the Application")
	public void user_launch_the_application() throws InterruptedException {
		
    get("https://omni.axisbank.co.in/axisretailbanking/");
    driver.manage().window().maximize();
    Thread.sleep(5000);
	}

	@When("user Click MPIN Tab")
	public void user_click_mpin_tab() {
	click_On_Element(manager.getOnboard().getMPIN());
	}

	@When("user Enter CustomerID In Customer ID Field")
	public void user_enter_customer_id_in_customer_id_field() {
		send_keys(manager.getOnboard().getCustID(), "858614810");
	}

	@When("user Enter MPIN In Mpin Field")
	public void user_enter_mpin_in_mpin_field() throws InterruptedException {
		send_keys(manager.getOnboard().getMpin(), "123123");
		Thread.sleep(10000);
	}

	@Then("user CLick On The Login Button And It Navigates to Axis Bank Dashboard Page")
	public void user_c_lick_on_the_login_button_and_it_navigates_to_axis_bank_dashboard_page() throws InterruptedException {
	click_On_Element(manager.getOnboard().getLogin());
	Thread.sleep(10000);
	}

}
