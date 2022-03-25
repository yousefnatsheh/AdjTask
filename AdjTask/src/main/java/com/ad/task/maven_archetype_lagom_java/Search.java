package com.ad.task.maven_archetype_lagom_java;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search extends Base{
	
	
	@Test
	public void searchByKeyWord() throws InterruptedException {
		
	
    driver.findElement(By.cssSelector("#ooui-php-1")).sendKeys("Quality");
    driver.findElement(By.cssSelector("button.oo-ui-inputWidget-input")).click();	
    driver.findElement(By.cssSelector(".mw-search-exists")).isDisplayed(); // Make sure that some elements exist
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".oo-ui-indicator-clear")).click();
    driver.findElement(By.cssSelector("button.oo-ui-inputWidget-input")).click();
    
	}
	
	@Test
	public void randomLinksCheck() throws InterruptedException {
	   driver.findElement(By.cssSelector("#n-contents > a:nth-child(1) > span:nth-child(1)")).click();	
	   Thread.sleep(2000);
	   String ExpectedText1 = "Wikipedia:Contents - Wikipedia";
	   Assert.assertEquals(ExpectedText1, driver.getTitle());

	   
	   driver.findElement(By.cssSelector("#n-currentevents > a:nth-child(1) > span:nth-child(1)")).click();	
	   Thread.sleep(2000);
	   String ExpectedText2 = "Portal:Current events - Wikipedia";
	   Assert.assertEquals(ExpectedText2, driver.getTitle());
	   
	   driver.findElement(By.cssSelector("#n-aboutsite > a:nth-child(1) > span:nth-child(1)")).click();	
	   Thread.sleep(2000);
	   String ExpectedText3 = "Wikipedia:About - Wikipedia";
	   Assert.assertEquals(ExpectedText3, driver.getTitle());
	   
	   
	   
	}
	
	
	
	
}
