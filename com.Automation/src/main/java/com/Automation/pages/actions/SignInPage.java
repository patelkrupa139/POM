package com.Automation.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.Automation.base.Page;
import com.Automation.pages.locators.SignInPageLocators;

public class SignInPage extends Page {
	
	public SignInPageLocators signinPage;
	
	public SignInPage() {
		
		this.signinPage = new SignInPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.signinPage);
		
	}

	public void doLogin(String username, String password) {
		
		signinPage.email.sendKeys(username);
		signinPage.password.sendKeys(password);
		signinPage.submit.click();
		
	}
}
