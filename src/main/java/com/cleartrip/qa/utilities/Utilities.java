package com.cleartrip.qa.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cleartrip.qa.base.TestBase;

public class Utilities extends TestBase {
	
	public void select_drop_down_value(WebElement element, String value)
	{
		Select s= new Select(element);
		s.selectByValue(value);		
	}
	
	
	

}
