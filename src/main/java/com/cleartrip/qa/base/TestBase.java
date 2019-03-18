package com.cleartrip.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
		
	public TestBase()
	{
		try 
		{
			prop= new Properties();
			FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\cleartrip\\qa\\config\\config.properties");
			prop.load(ip);	
			
	    }
	
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	
	catch(IOException e)
	{
		e.printStackTrace();
	}				
}
	public static void intilization()
	{
		if(prop.getProperty("browser").contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\softwares\\chromedriver.exe");
			driver = new ChromeDriver();			
		}
		
		else if(prop.getProperty("browser").contains("mozilla"))
		{
			driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));		
	}
	
	
	
	

}
