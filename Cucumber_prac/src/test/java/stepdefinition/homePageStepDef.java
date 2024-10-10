package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import junit.framework.Assert;
import myHooks.Hooks;
import pageObject.homePage;
import pageObject.landingPage;

public class homePageStepDef extends Base {

	public WebDriver driver;
	public homePage hp;
	public landingPage lp;
	public WebDriver landingpagedriver;
	WebDriverWait wait ;
	public Hooks hooks;

	@Given("User is logged in and on landing Page")
	public void user_is_logged_in_and_on_landing_page() {

		 driver = landingPageDriver();

		driver.manage().window().maximize();
		
		//  hooks = new Hooks(driver);
	

	}

	@Given("User is on homePage")
	public void user_is_on_home_page() {

		 
		hp = new homePage(driver);
		waitForElementPresent(hp.headerText);
		String hearText = hp.getheadertext();
		Assert.assertEquals("Automation Practice", hearText);
		
	}

	@When("^User check for item (.+)$")
	public void user_check_for_item_adidas_original(String ItemCart) {

		waitForElementPresent(hp.cardlistsAva);
		
		List< WebElement> CardsPresent =hp.allelementList();
		
		for(WebElement Card:CardsPresent) {
			
		String item =	Card.getText();
		System.out.println(item);
		
		if( item.contains(ItemCart)){
			
			Card.findElement(By.xpath("preceding::h5//following-sibling::button[2]")).click();
			
		}
		}
		
	}

	@When("If user finds required items")
	public void if_user_finds_required_items() {
		
	}

	@When("User Clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("User validates items added to cart")
	public void user_validates_items_added_to_cart() {
		// Write code here that turns the phrase above into concrete actions
		
	}

}
