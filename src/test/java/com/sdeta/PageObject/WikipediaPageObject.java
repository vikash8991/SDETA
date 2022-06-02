package com.sdeta.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikipediaPageObject {
WebDriver driver;
	
	@FindBy(name="search")
	WebElement txtIMDb;
	
	public WikipediaPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void SearchMovieName1(String uname) {
		txtIMDb.sendKeys("Pushpa:The Rise"+Keys.ENTER);
	}

}
