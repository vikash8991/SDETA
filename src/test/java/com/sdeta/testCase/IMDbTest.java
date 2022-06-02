package com.sdeta.testCase;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.sdeta.PageObject.IMDbPageObject;

public class IMDbTest extends BaseClass {
	
	@Test
	public void SearchMovieReleaseDateAndCountryOfOrigin()
	{
		driver.get(baseUrlIMDb);
		//go to page object and execute the searchmoviename method
		IMDbPageObject obj =new IMDbPageObject(driver);
		obj.SearchMovieName(baseUrlWikipidea);
		
		if(driver.getTitle().equals("IMDbPageObject"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

}
