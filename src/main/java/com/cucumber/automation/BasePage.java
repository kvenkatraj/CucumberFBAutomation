package com.cucumber.automation;

import org.openqa.selenium.WebDriver;

public class BasePage {
	protected WebDriver driver;
	
	public void waitInSeconds(int seconds){
		try{
		Thread.sleep(seconds*1000);
		}catch(Exception ex){
			
		}
		
	}
	
	
}
