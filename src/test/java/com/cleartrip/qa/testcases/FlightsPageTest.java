package com.cleartrip.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cleartrip.qa.base.TestBase;
import com.cleartrip.qa.pages.FlightsPage;
import com.cleartrip.qa.pages.HotelsPage;

public class FlightsPageTest extends TestBase{
	
	HotelsPage hotelspage;
	FlightsPage flightpage;
	
	public FlightsPageTest()
	{
		super();
		
	}
	
	
	@BeforeMethod
	public void setup()
	{
		intilization();
		
	}
	
	
	@Test
	public void tittlecheckup()
	{
		flightpage = new FlightsPage();
		Assert.assertEquals(flightpage.get_title(), "#1 Site for Booking Flights, Hotels, Packages, Trains & Local activities.");
		
		
	}

}
