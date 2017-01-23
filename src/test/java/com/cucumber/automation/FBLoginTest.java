package com.cucumber.automation;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.DataTableRow;


public class FBLoginTest extends BaseTest {
	
	
	
	@Given("^user goes to fb login page$")
	public void user_goes_to_fb_login_page() throws Throwable {
		initialSetup();
	}
	
	
	
	@When("^user enters valid username and passsword$")
	public void user_enters_valid_username_and_passsword() throws Throwable {
		
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		
	}
	
	
	
	@When("^user enters Invalid username \"([^\"]*)\" or Invalid passsword \"([^\"]*)\"$")
	public void user_enters_Invalid_username_or_Invalid_passsword(String userName, String password) throws Throwable {
		LogInPage loginpage = new LogInPage(driver);
		loginpage.login(userName,password);
		
	    
	}


	@Then("^User shouldn't be logged into the application and should be redirected to login error page\\.$")
	public void user_shouldn_t_be_logged_into_the_application_and_should_be_redirected_to_login_error_page() throws Throwable {
		
		
	}
	
	@Given("^user goes to fb registration page$")
	public void user_goes_to_fb_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


	
	@When("^user enters the following user details$")
	public void user_enters_the_following_user_details(DataTable dataTable) throws Throwable {
		List<DataTableRow> gherkinRows = dataTable.getGherkinRows();
		
		
		
//		List<UserRegistration> users = new ArrayList<UserRegistration>;
//		
//		for (DataTableRow dataTableRow : gherkinRows) {
//			UserRegistration user = new UserRegistration();
//			
//			List<String> cols = dataTableRow.getCells();		
//			
//				user.setFirstName(cols.get(0));
//				user.setLastNameName(cols.get(1));
//				
//				users.add(user);		
//			
//		}
		
		
		
		
		
		
		List<List<String>> raw = dataTable.raw();
		
		for (List<String> row : raw) {
			
			for (String val : row) {
				System.out.println("My tet data" + val);				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
	    
	}

	@Then("^registration should be successful\\.$")
	public void registration_should_be_successful() throws Throwable {
	    
	}




	

}
