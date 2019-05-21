package com.Automation.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.Automation.base.Page;
import com.Automation.pages.locators.HomePageLocators;

public class HomePage extends Page {

	public HomePageLocators home;
	
public HomePage() {
	
	this.home = new HomePageLocators();
	PageFactory.initElements(driver, this.home);
	
	
	
}
	
	public void checkLogoImage() {
		home.checkLogo.click();
	}
	
	public void gotoWomen() {
		
	}
	public void gotoDresses() {
		
	}
	
	public void gotoTShirts() {
		
	}
	
}
