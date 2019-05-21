package com.Automation.base;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Automation.pages.actions.TopNavigation;
import com.Automation.utilities.ExcelReader;
import com.Automation.utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class Page {
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	  public static ExcelReader excel = new ExcelReader(
	  System.getProperty("user.dir") +
	  "\\src\\test\\resources\\excel\\testdata.xlsx");
	 
	public static String browser;
	public static WebDriverWait wait;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static TopNavigation topNav;
	

	public static void initConfiguration(){
	if(Constants.browser.equalsIgnoreCase("firefox")){
		
		driver = new FirefoxDriver();
		log.debug("Launching Firefox");
	}else if(Constants.browser.equalsIgnoreCase("chrome")){
		
		System.setProperty("webdriver.chrome.driver",
				"./src/test/resources/executables/chromedriver.exe");

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");

		driver = new ChromeDriver(options);
		log.debug("Launching Chrome");
	}else if(Constants.browser.equals("ie")){
		
		System.setProperty("webdriver.ie.driver",
				"./src/test/resources/executables/IEDriverServer.exe");
		
		driver = new InternetExplorerDriver();
		log.debug("Launching IE");
	}
	
	driver.get(Constants.testsiteurl);
	driver.manage().window().maximize();
	topNav = new TopNavigation(driver);
	
	}

	public static void quitBrowser(){
		
		driver.quit();
		
	}
	
}
