package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
public WebDriver driver;
	
	
	@FindBy(xpath ="//input[@id='userEmail']")
	WebElement login_field;
	

	@FindBy(xpath ="//input[@id='userPassword']")
	WebElement pass_field;
	
	@FindBy(xpath ="//input[@id='login']")
	WebElement login_button;
	
	
	public loginPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}

	public void enterloginID(String loginId) {
		
		login_field.sendKeys(loginId);
	}
	
public void enterPassword(String Password) {
		
	pass_field.sendKeys(Password);
	}


	public void doLogin() {
		login_button.click();
		
	}
	
	public WebDriver doLoginAndGoAdashboard(String loginId, String Password) {
		
		login_field.sendKeys(loginId);
		pass_field.sendKeys(Password);
		login_button.click();
		
		return driver;
	}

}
