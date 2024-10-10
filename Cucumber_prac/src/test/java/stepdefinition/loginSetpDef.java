package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import helpers.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObject.landingPage;

public class loginSetpDef extends Base{
	
	public WebDriver driver;
	public  landingPage lp ;
	
	@Given("User opens Url and login into web application")
	public void user_opens_url() {
		
		driver = intialisedriver();
		 driver.get("https://rahulshettyacademy.com/client/");
		 driver.manage().window().maximize();
		    System.out.println("Landing Page launched successfully");
		     lp = new landingPage(driver);
	   
	}
	
	
	
	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
	   
	
	  
	}
	@When("^User insert valid Credentials as (.+) and (.+)$")
	public void user_insert_valid_credentials_as_tejasjadhav8888_gmail_com_and_pass(String Username, String Password) {
	    // Write code here that turns the phrase above into concrete actions
		lp.enterloginID(Username);
		lp.enterPassword(Password);
	}
	@When("Clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   lp.doLogin();
	}
	
	
	@Then("^User gets logged in and lands on home page (.+)$")
	public void user_gets_logged_in_and_lands_on_home_page_let_s_shop(String PageTitle) {
	    // Write code here that turns the phrase above into concrete actions
	  
		String ActualPgeTitle= driver.getTitle();
		System.out.println(ActualPgeTitle);
		
	Assert.assertEquals(PageTitle, ActualPgeTitle);
	}


@AfterClass

public void tearDown()
{


driver.quit();

}
}
