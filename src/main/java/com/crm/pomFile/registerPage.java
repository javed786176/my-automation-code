package com.crm.pomFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class registerPage {
	@Test
	public void register() throws InterruptedException
	{

		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		  driver.navigate().to("https://demowebshop.tricentis.com/login");
		  Register  dws=new Register(driver);
		  Thread.sleep(2000);
		  dws.register();
		  dws.gender();
		  dws.firstname("amin01");
		  dws.lastname("shah");
		  dws.email("jshah9517@gmail.com");
		  dws.password("admin01");
		  dws.confirm("admin01");
		  dws.registercompleted();
		 // dws.login_button();
	}

}
