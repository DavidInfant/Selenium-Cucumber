package org.stepdefinition;

import org.sam.BaseClass;
import org.sam.FlipkartLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBLogin extends BaseClass{
	FlipkartLogin f;
	@Given("To launch the chrome browser and maximise window")
	public void to_launch_the_chrome_browser_and_maximise_window() {
		launchBingBrowser();
		bingWindowMaximizer();
	}
	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
		launchBingUrl("https://en-gb.facebook.com/");
	    
	}
	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		f = new FlipkartLogin();
		passText("seleniuminmakes@gmail.com", f.getEmail());
	}
	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() {
		f = new FlipkartLogin();
		passText("selenium@123", f.getPassword());
	}
	@When("To click the login button")
	public void to_click_the_login_button() {
		f = new FlipkartLogin();
		clickBtn(f.getLogin());
	}
	@When("To check whether navigate to the home page or not")
	public void to_check_whether_navigate_to_the_home_page_or_not() {
		System.out.println("Check your login credentials");
	}
	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBingBrowser();
	}
}
