package org.sam;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Date;

import org.sam.BaseClass;

public class TestNGLaunch extends BaseClass{
	@BeforeClass
	public void launchTheBrowser() {
		launchBingBrowser();
	}
	
	
	@BeforeMethod
	public void startDate() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test
	public void tc1() {
		System.out.println("Test case 1");
		launchBingUrl("https://www.gmail.com/");
		bingWindowMaximizer();
	}
	
	@Test
	public void tc2() {
		System.out.println("Test case 2");
		launchBingUrl("https://www.inmakes.com//");
		bingWindowMaximizer();
	}
	
	@Test
	public void tc3() {
		System.out.println("Test Case 3");
		launchBingUrl("https://en-gb.facebook.com/");
		bingWindowMaximizer();
	}
	@AfterMethod
	public void endDate() {
		Date d = new Date();
		System.out.println(d);
	}
	@AfterClass
	public void closeTheBrowser() {
		closeEntireBingBrowser();
	}

}
