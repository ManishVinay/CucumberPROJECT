package com.facebook.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;
	
	@Before
	public void initalize() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-14\\eclipse\\java-oxygen\\eclipse\\Manish\\org.task\\src\\test\\resources\\library\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@After
	
		public void closing() {
		driver.quit();
		
		
	}

}
