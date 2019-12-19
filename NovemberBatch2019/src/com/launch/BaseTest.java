 package com.launch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	 public static WebDriver driver; 
	 public static Properties p;
	 public static void init() throws IOException
	 {
		FileInputStream fis= new FileInputStream("C:\\Users\\durga\\eclipse-workspace\\NovemberBatch2019\\data.properties");
		p=new Properties();
	      p.load(fis);	
	 }
	 public static void launch( String browser)
	{
	  if(p.getProperty(browser).equals("chrome"))	
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      driver=new ChromeDriver();  
	  }
	  else if(browser.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\durga\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	      driver=new FirefoxDriver();

	  }
	  }
	 public static void navigateurl(String url)
	 {
	 driver.get(url);
}
	 } 


