package practice_selenium_01;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_01 {

	public static void main(String[] args) {
	 
	System.setProperty("webdriver.chrome.driver","/Users/shanjidaroshni/eclipse-workspace/LearningSelinium/driver/chromedriver");
   
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize(); //or
	driver.manage().window().fullscreen();
	driver.get("https://www.google.com");
	driver.quit();
	
	}

}
