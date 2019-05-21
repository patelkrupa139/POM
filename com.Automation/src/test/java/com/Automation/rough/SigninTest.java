package com.Automation.rough;

import org.testng.annotations.Test;

import com.Automation.base.Page;
import com.Automation.pages.actions.SignInPage;

public class SigninTest {
	
	@Test
	public void signInTest() {
		
	
		Page.initConfiguration();
		SignInPage signin = Page.topNav.gotoSignIn();
		signin.doLogin("patelkrupa_13@yahoo.com", "patel");
		Page.quitBrowser();
	}

}
