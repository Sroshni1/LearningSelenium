package practice_selenium_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day_02 {
  
   WebDriver driver; 
    
    @BeforeTest
    public void setUp() { 
    	System.setProperty("webdriver.chrome.driver", "/Users/shanjidaroshni/eclipse-workspace/LearningSelinium/driver/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
	}
    
    @Test
    public void UrlTest() throws InterruptedException  {
    driver.get("https://www.walmart.com");
    Thread.sleep(4000);
    }
 
	@AfterTest
    public void tearUp(){
     driver.quit(); 
    }  
  
} 
    
    
    
    
    
    
    

