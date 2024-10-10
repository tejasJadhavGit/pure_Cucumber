package helpers;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.landingPage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {


    public WebDriver driver;
    public JavascriptExecutor js;
    public WebDriverWait wait;
    public static ExtentReports exReports;
    public static ExtentSparkReporter reporter;
 


    public WebDriver intialisedriver()
    {

        System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//ChromeOptions options = new ChromeOptions();
//options.addArguments("headless");
//        driver = new ChromeDriver(options);
        //wait = new WebDriverWait(this.driver, 15);
      
        return driver;

    }
    
    
    public WebDriver landingPageDriver() {
    	

    	 WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 driver.get("https://rahulshettyacademy.com/client/");
		 driver.manage().window().maximize();
	
		 System.out.println("User is on Login Page");
		 
		 driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("tejasjadhav8888@gmail.com");
	
		 driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Practice123");

		 driver.findElement(By.xpath("//input[@id='login']")).click();
		 
		 return driver;
			
			
			
		     
    	
    }


    public WebDriver intialisedriver(String URL)
    {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get(URL);
        driver.manage().window().maximize();

        return driver;

    }

    public String getURL() throws IOException
    {

        Properties pr= new Properties();

        FileInputStream fl= new FileInputStream("D:\\Git\\NewProj_2024\\src\\main\\utilities.properties");

        pr.load(fl);


        String URL =(String) (pr.get("URL"));

        return URL;
    }

    public JavascriptExecutor scrolldown()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver ;
        js.executeScript("window.scrollBy(0, 250)");
        return js;
    }

    public void waitForElementPresent(By locator) {

        try {

            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
           // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(" Element Displayed successfully");
        } catch (Exception e) {

            System.out.println(" some error occured waitForElementPresent");
            e.printStackTrace();
        }

    }


    public String getscreenshot(String testcaseName,WebDriver driver) throws IOException {

      TakesScreenshot ts = (TakesScreenshot) driver;
        File filePaths= new File (System.getProperty("user.dir") + "//reports// " + testcaseName + ".jpg");
        File fl =ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(fl, filePaths);

        return System.getProperty("user.dir") + "//reports// " + testcaseName + ".jpg";

    }

//    @AfterClass
//    public  void teardown()
//    {
//        driver.close();
//
//    }
}
