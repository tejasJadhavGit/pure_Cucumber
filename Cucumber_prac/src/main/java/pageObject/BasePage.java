package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends Page{

	public BasePage(WebDriver driver) {
		super(driver);
		
	}

	@Override
	public String getPageTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageHeader(By locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getURL(String URLname) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement getElement(By locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void waitForElementPresent(By locator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waitForPageTitle(String title) {
		// TODO Auto-generated method stub
		
	}
	
	

}
