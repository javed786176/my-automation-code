package com.crm.pomFile;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pomFile.login;
import com.crs.pom.DwsLogInPage;

public class logindemo {
	@Test
	public void logindemo() throws InterruptedException
	{
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		  driver.navigate().to("https://demowebshop.tricentis.com/login");
		  login  dws=new login(driver);
		  Thread.sleep(2000);
		  dws.username("admin01@gmail.com");
		  dws.password("admin01");
		  dws.remeberme();
		  dws.login_button();
	}

}
