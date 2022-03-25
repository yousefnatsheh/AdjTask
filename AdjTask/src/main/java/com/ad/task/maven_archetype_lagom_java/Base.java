package com.ad.task.maven_archetype_lagom_java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

/**
 * Hello world!
 *
 */
public class Base 
{

	protected WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
	    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://en.wikipedia.org/w/index.php?search");
	    Thread.sleep(2000);
	    System.out.println(driver.getTitle());
	  
	}
	
	@AfterMethod
	public void setDown()
	{
		  driver.quit();
	}
	
	
	
	
	
}
