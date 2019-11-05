package com.selenium.testfunctions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.webelementlocators.GoogleSearchWebElementLocator;

public class GoogleSearchFunction {
	
	public WebDriverWait browserElementWait(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(GoogleSearchWebElementLocator.GOOGLE_SEARCH_BOX));
		return wait;
	}

	public boolean googleSearchEngineWord(WebDriver driver, WebDriverWait wait) {
		driver.findElement(GoogleSearchWebElementLocator.GOOGLE_SEARCH_BOX).sendKeys("Chemtrails");
		wait.until(ExpectedConditions.elementToBeClickable(GoogleSearchWebElementLocator.GOOGLE_SEARCH_BUTTON));
		driver.findElement(GoogleSearchWebElementLocator.GOOGLE_SEARCH_BUTTON).sendKeys(Keys.ENTER);
		String getWord = driver.findElement(GoogleSearchWebElementLocator.GOOGLE_SEARCH_BOX).getAttribute("value");
		if(getWord.contains("Chemtrails")){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean googleSearchEnginePhrase(WebDriver driver, WebDriverWait wait) {
		driver.findElement(GoogleSearchWebElementLocator.GOOGLE_SEARCH_BOX).sendKeys("Dealey Plaza");
		wait.until(ExpectedConditions.elementToBeClickable(GoogleSearchWebElementLocator.GOOGLE_SEARCH_BUTTON));
		driver.findElement(GoogleSearchWebElementLocator.GOOGLE_SEARCH_BUTTON).sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(GoogleSearchWebElementLocator.GOOGLE_SEARCH_IMAGE_TITLE));
		String getWord = driver.findElement(GoogleSearchWebElementLocator.GOOGLE_SEARCH_IMAGE_TITLE).getText();
//		assertEquals(annotationDefaultPageAppear, true);
		if(getWord.contains("Dealey Plaza")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean googleSearchEngineMapOption(WebDriver driver, WebDriverWait wait) {
		wait.until(ExpectedConditions.elementToBeClickable(GoogleSearchWebElementLocator.GOOGLE_SEARCH_OPTION));
		driver.findElement(GoogleSearchWebElementLocator.GOOGLE_SEARCH_OPTION).click();
		wait.until(ExpectedConditions.elementToBeClickable(GoogleSearchWebElementLocator.GOOGLE_SEARCH_OPTION_MAP));
		driver.findElement(GoogleSearchWebElementLocator.GOOGLE_SEARCH_OPTION_MAP).click();
		wait.until(ExpectedConditions.elementToBeClickable(GoogleSearchWebElementLocator.GOOGLE_SEARCH_OPTION_MAP_LAYOUT));
		driver.findElement(GoogleSearchWebElementLocator.GOOGLE_SEARCH_OPTION_MAP_MENU).click();
		wait.until(ExpectedConditions.elementToBeClickable(GoogleSearchWebElementLocator.GOOGLE_SEARCH_OPTION_MAP_MENU_GLOBAL_LAYOUT));
		boolean flatEarthViewButton = driver.findElement(GoogleSearchWebElementLocator.GOOGLE_SEARCH_OPTION_MAP_MENU_GLOBAL_LAYOUT).isEnabled();
		if(flatEarthViewButton) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean googleSearchEngineMapOptions(WebDriver driver, WebDriverWait wait) {
		driver.findElement(GoogleSearchWebElementLocator.GOOGLE_SEARCH_BOX).sendKeys("Google Maps");
		wait.until(ExpectedConditions.elementToBeClickable(GoogleSearchWebElementLocator.GOOGLE_SEARCH_BUTTON));
		driver.findElement(GoogleSearchWebElementLocator.GOOGLE_SEARCH_BUTTON).sendKeys(Keys.ENTER);
		
		wait.until(ExpectedConditions.elementToBeClickable(GoogleSearchWebElementLocator.GOOGLE_SEARCH_OPTION));
		driver.findElement(GoogleSearchWebElementLocator.GOOGLE_SEARCH_OPTION).click();
		wait.until(ExpectedConditions.elementToBeClickable(GoogleSearchWebElementLocator.GOOGLE_SEARCH_OPTION_MAP));
		driver.findElement(GoogleSearchWebElementLocator.GOOGLE_SEARCH_OPTION_MAP).click();
		wait.until(ExpectedConditions.elementToBeClickable(GoogleSearchWebElementLocator.GOOGLE_SEARCH_OPTION_MAP_LAYOUT));
		driver.findElement(GoogleSearchWebElementLocator.GOOGLE_SEARCH_OPTION_MAP_MENU).click();
		wait.until(ExpectedConditions.elementToBeClickable(GoogleSearchWebElementLocator.GOOGLE_SEARCH_OPTION_MAP_MENU_GLOBAL_LAYOUT));
		boolean flatEarthViewButton = driver.findElement(GoogleSearchWebElementLocator.GOOGLE_SEARCH_OPTION_MAP_MENU_GLOBAL_LAYOUT).isEnabled();
		if(flatEarthViewButton) {
			return true;
		} else {
			return false;
		}
	}
	
}
