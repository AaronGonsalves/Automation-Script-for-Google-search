package com.selenium.browsersettings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.propertyreader.PropertyReader;

public class BrowserIntialization {
	
	WebDriver driver;
	
	public WebDriver settingUpBrowsers() {
		System.setProperty(PropertyReader.getProperty("WebDirver"),PropertyReader.getProperty("WebDrivePath"));
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}
	
	public void URLLink() {
		driver.get(PropertyReader.getProperty("URL"));
	}
	
	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}

}