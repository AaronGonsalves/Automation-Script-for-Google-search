package com.selenium.testcases;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.browsersettings.BrowserIntialization;
import com.selenium.testfunctions.GoogleSearchFunction;

public class GoogleSearchTestCase {
	
	WebDriver driver;

	WebDriverWait wait;

	BrowserIntialization browserIntialization;
	
	GoogleSearchFunction googleSearchFunction;
	
	@BeforeMethod
	public void browserSetup() {
		browserIntialization = new BrowserIntialization();
		driver = browserIntialization.settingUpBrowsers();
		browserIntialization.URLLink();
		googleSearchFunction = new GoogleSearchFunction();
		wait = googleSearchFunction.browserElementWait(driver);
	}
	
	@AfterMethod
	public void browserCleanUp() {
//		browserIntialization.closeBrowser(driver);
	}
	
	@Test(priority = 1, enabled = false, description = "Confirm the first text entry contains the word 'Chemtrails'")
	public void verifyTheFirstTextEntryContainsTheWordChemtrails() {
		boolean firstTextEntryWord = googleSearchFunction.googleSearchEngineWord(driver, wait);
		assertEquals(firstTextEntryWord, true);
	}
	
	@Test(priority = 2, enabled = false, description = "Confirm the first image title contains the phrase 'Dealey Plaza'")
	public void verifyTheFirstImageTitleContainsThePhraseDealeyPlaza() {
		boolean annotationDefaultPageAppear = googleSearchFunction.googleSearchEnginePhrase(driver, wait);
		assertEquals(annotationDefaultPageAppear, true);
	}
	
	@Test(priority = 3, enabled = true, description = "Confirm that Google has provided an option named 'Flat Earth View'")
	public void verifyThatGoogleHasProvidedOptionNamedFlatEarthView() {
		boolean annotationDefaultPageAppear = googleSearchFunction.googleSearchEngineMapOptions(driver, wait);
		assertEquals(annotationDefaultPageAppear, true);
	}
}
