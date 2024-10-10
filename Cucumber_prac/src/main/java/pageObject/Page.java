package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Page {

	public WebDriver driver;
	
	public Page(WebDriver driver) {
		
		this.driver=driver;
	}

	public abstract String getPageTitle();

	    public abstract String getPageHeader(By locator);

	    public abstract String getURL(String  URLname) throws IOException;

	    public abstract WebElement getElement(By locator);

	    public abstract void waitForElementPresent(By locator);

	    public abstract void waitForPageTitle(String title);
}
