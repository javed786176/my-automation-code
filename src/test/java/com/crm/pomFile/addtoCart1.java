package com.crm.pomFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class addtoCart1 {
	
	@Test
	public void addTocart() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		  driver.navigate().to("https://demowebshop.tricentis.com/");
		  addtocart  dws=new addtocart(driver);
		  Thread.sleep(2000);
		  dws.digitaldownload();
		  Thread.sleep(2000);
		  dws.addToCart();
	}

}
