package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Base Class:
 * open browser with maximum window.
 * handle synchronization issue
 * */
 
public class Base {
	public WebDriver driver;
	public String landingPage = "https://www.google.com";
	
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(landingPage);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
	}
	
}
