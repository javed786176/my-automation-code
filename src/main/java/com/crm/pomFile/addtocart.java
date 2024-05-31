package com.crm.pomFile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocart {
	
	public addtocart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	private @FindBy(xpath="//a[contains(text(),'Digital downloads')]")
	WebElement digitaldownload;
	
	private @FindBy(xpath="//input[@value='Add to cart']")
	WebElement addtocart;
	
	public void digitaldownload()
	{
		digitaldownload.click();
	}
	
	public void addToCart() throws InterruptedException
	{
		 for (int i = 0; i < 3; i++) {
			addtocart.click();
			Thread.sleep(2000);
		}

	}

	

}
