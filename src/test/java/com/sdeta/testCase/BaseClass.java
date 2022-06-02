package com.sdeta.testCase;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public String baseUrlIMDb="https://www.imdb.com/";
	public String baseUrlWikipidea="https://en.wikipedia.org/wiki/Main_Page";
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() 
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver/chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize();
		}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
