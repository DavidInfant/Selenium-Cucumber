package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailLogin extends BaseClass{
	@Given("User has to launch the browswer and maximise the window")
	public void user_has_to_launch_the_browswer_and_maximise_the_window() {
		launchBingBrowser();
	    bingWindowMaximizer();
	}
	@When("User has to launch Gmail url")
	public void user_has_to_launch_Gmail_url() {
		launchBingUrl("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowEntry=ServiceLogin&flowName=GlifWebSignIn&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=ATuJsjxOtuGftg9mtmimx2h8TBCmWG_90dTlit6rxajJCzzNc4aXq0pta655KD-82DGutVK5j5tsqQ&osid=1&passive=1209600&service=mail&theme=glif&hl=en-GB");
	}
	@When("User has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String email) {
		WebElement emField = bingDriver.findElement(By.id("identifierId"));
	    passText(email, emField);
	    WebElement nextBtn = bingDriver.findElement(By.xpath("//span[text()='Next']"));
	    nextBtn.click();   
	}
	@When("User has tp pass the data {string} in password field")
	public void user_has_tp_pass_the_data_in_password_field(String password) {
		WebElement pass = bingDriver.findElement(By.xpath("//input[@type='password']"));
	    passText(password, pass);
	}
	@When("User has to click login button")
	public void user_has_to_click_login_button() {
	    WebElement loginBtn = bingDriver.findElement(By.xpath("//span[text()='Next']"));
	    loginBtn.click();
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
	    closeEntireBingBrowser();
	}

}