package com.cucumber.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	protected WebDriver driver;
	
	public void initialSetup(){
		
		System.setProperty("webdriver.chrome.driver", "D:/venkat/javatraining/ws/MyFirstProject/lib/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
	}
	
	public void close(){
		driver.close();
	}
	
	

}
