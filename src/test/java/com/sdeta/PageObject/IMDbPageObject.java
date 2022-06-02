package com.sdeta.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IMDbPageObject {
	
	WebDriver driver;
	
	@FindBy(name="q")
	WebElement txtIMDb;
	
	public IMDbPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void SearchMovieName(String uname) {
		txtIMDb.sendKeys("Pushpa:The Rise"+Keys.ENTER);
	}

}
