package com.cleartrip.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cleartrip.qa.base.TestBase;

public class FlightsPage extends TestBase {
	
	
	public FlightsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// page factory
	
	@FindBy(xpath="//input[@id='OneWay']") 
	WebElement oneway_radio_button;
	
	@FindBy(xpath="//*[@id='RoundTrip']") 
	WebElement round_trip_radio_button;
	
	@FindBy(xpath="//*[@id='MultiCity']") 
	WebElement Multi_city_radio_button;
	
	@FindBy(xpath="//*[@id=\"FromTag\"]")
	WebElement From;
	
	@FindBy(xpath="//*[@id=\'ToTag\']") 
	WebElement To;
	
	@FindBy(xpath="//*[@id=\'Adults\']") 
	WebElement Adults;
	
	@FindBy(xpath="//*[@id=\'Childrens\']")
	WebElement Children;
	
	@FindBy(xpath="//*[@id=\'Infants\']")
	WebElement Infants;
	
	@FindBy(xpath="//*[@id=\'MoreOptionsLink\']")
	WebElement More_Options;
	
	@FindBy(xpath="//*[@id=\'Class\']") 
	WebElement Class_of_Travel;
	
	@FindBy(xpath="//*[@id=\'AirlineAutocomplete\']") 
	WebElement Preferred_Airline;
	
	@FindBy(xpath="//*[@id=\'SearchBtn\']") 
	WebElement Search_flights;
	
	@FindBy(xpath="//a[text()=\'Hotels\']")
	WebElement Hotels_Link;
	
	@FindBy(xpath="//a[text()='Trains']") 
	WebElement Trains_Link;
	
	
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////
	
	////////////////////Page Functionalities///////////////////////
	
	public HotelsPage click_on_hotels_page()
	{
	
		Hotels_Link.click();
		
		return new HotelsPage();
		
	}
	
	public String get_title()
	{		
	return driver.getTitle();	
	}
	
	//public void search_flight(String from, String to, )
	
	
	
	
	
	
	
	
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////// 
	
	
	
	
	

}
