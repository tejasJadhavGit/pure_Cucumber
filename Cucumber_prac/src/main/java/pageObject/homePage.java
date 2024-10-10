package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.Base;

public class homePage extends Base {
	
	public WebDriver driver;
	public  landingPage lp ;
	
	
	@FindBy(xpath="//div[@class='row']")
	String allAvailableItemsallAvailableItems;
	
	@FindBy(xpath="//div[@class='card-body']//h5//b")
	List<WebElement> cards;
	//List<WebElement> cards = driver.findElements(By.xpath("//div[@class='card-body']//h5//b"));

	@FindBy(xpath="//div[@class='card-body']//h5//b//preceding::h5//following-sibling::button[2]")
public	WebElement addToCart;
	//div[@class='card-body']//button[2]
	
	@FindBy(xpath="//p[text()='Automation Practice']")
	public 	WebElement headerHomePage;
	
	public By  headerText = By.xpath("//p[text()='Automation Practice']");
	
	public By  cardlistsAva = By.xpath("//div[@class='card-body']//h5//b");
	
	public homePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public List<WebElement> allelementList() {
		
		
		List<WebElement> cardsList= cards;
			//	driver.findElements(By.xpath("//div[@class='card-body']//h5//b"));
		
		if (cardsList.size()>0) {
			
			System.out.println(cardsList.size() + "cards available");
			return cardsList;
		}

		else{System.out.println("No cards available");}
	
		
	//return driver.findElements(By.xpath(allAvailableItemsallAvailableItems)) ;
		return cardsList;
	
	}
	
	public String getheadertext() {
		
		return headerHomePage.getText();
		
	}
	
public WebDriver landingpageDriver() {
	   
		
		driver = intialisedriver();
		 driver.get("https://rahulshettyacademy.com/client/");
		 driver.manage().window().maximize();
		    System.out.println("Landing Page launched successfully");
		     lp = new landingPage(driver);
		 return   lp.doLoginAndGoAdashboard();
		
	}
}
