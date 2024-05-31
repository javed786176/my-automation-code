package com.crm.pomFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	public Register(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//a[text()='Register']")
	WebElement register_button;
	@FindBy(id="gender-male")
	WebElement gender;
	@FindBy(id="FirstName")
	WebElement firstname;
	@FindBy(id="LastName")
	WebElement lastname;
	@FindBy(id="Email")
	WebElement email;
	@FindBy(id="Password")
	WebElement password;
	@FindBy(id="ConfirmPassword")
	WebElement confirmpassword;
	@FindBy(id="register-button")
	WebElement registercompleted;
	public void register()
	{
		register_button.click();
	}
	public void gender()
	{
		gender.click();
	}
	public void firstname(String value)
	{
		firstname.sendKeys(value);
	}
	public void lastname(String value)
	{
		lastname.sendKeys(value);
	}
	public void email(String value)
	{
		email.sendKeys(value);
	}
	public void password(String value)
	{
		password.sendKeys(value);
	}
	public void confirm(String value)
	{
		confirmpassword.sendKeys(value);
	}
	public void registercompleted()
	{
		registercompleted.click();
	}
}
