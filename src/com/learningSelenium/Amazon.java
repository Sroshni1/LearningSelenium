package com.learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {	
	System.setProperty("webdriver.chrome.driver", "/Users/shanjidaroshni/eclipse-workspace/LearningSelinium/driver/chromedriver"); 
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.com/ref=nav_logo");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.navigate().refresh();
	driver.findElement(By.xpath("(//a[@class='nav-a  '])[8]")).click();
	driver.findElement(By.xpath("(//span[@class='nav-a-content'])[6]")).click();
	}

}
