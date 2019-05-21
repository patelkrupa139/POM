package com.Automation.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageLocators {

	@FindBy(xpath = "//input[@id='email']")
	public WebElement email;
	@FindBy(xpath = "//input[@id='passwd']")
	public WebElement password;
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	public WebElement submit;
	
}