package com.sdeta.testCase;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.sdeta.PageObject.WikipediaPageObject;


public class WikipediaTest extends BaseClass {
	
	@Test
	public void SearchMovieReleaseDateAndCountryOfOrigin()
	{
		driver.get(baseUrlWikipidea);
		//go to page object and execute the searchmoviename method
		WikipediaPageObject obj =new WikipediaPageObject(driver);
		obj.SearchMovieName1(baseUrlWikipidea);
		
		if(driver.getTitle().equals("baseUrlWikipidea"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

}
