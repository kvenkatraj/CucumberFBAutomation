package com.cucumber.automation;
 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage extends BasePage {	
	
	
	private String firstName;
	
	public LogInPage(WebDriver driver){
		this.driver  = driver;
	}	
	
	public WebElement getEmailElement(){
		return driver.findElement(By.id("email"));
		
	}	
	public WebElement getPasswordElement(){
		return driver.findElement(By.id("pass"));
		
	}	
	
	public WebElement getLoginButtonElement(){
		return driver.findElement(By.id("u_0_n"));		
	}
	
	public void login(String userName, String password){
		getEmailElement().sendKeys(userName);
		getPasswordElement().sendKeys(password);
		getLoginButtonElement().click();			
	}
	
	
	
}
