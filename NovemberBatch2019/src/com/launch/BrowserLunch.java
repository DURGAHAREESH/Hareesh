package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLunch
{

	public static void main(String[] args) 
	{
		WebDriver driver;
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver_win32\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("https://www.amazon.in");

      System.setProperty("webdriver.gecko.driver", "C:\\Users\\durga\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
      driver=new FirefoxDriver();
      driver.get("https://www.flipkart.com");
	}

}
