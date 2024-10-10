package myHooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	public WebDriver driver;
//	
//	public Hooks(WebDriver driver) {
//		
//		this.driver = driver;
//	}

	@Before
	
	public void BeforeScenario(Scenario sc) {
		
		System.out.println("<------------Starting Scenario------------>");
		sc.getName();
	}
	
	@After
	
public void tearDown(Scenario sc) {
		
		System.out.println("<------------Ending Scenario------------>");
		//driver.quit();
		sc.getStatus();
	}
}
