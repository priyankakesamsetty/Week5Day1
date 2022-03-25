package week5Day1classroom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
           
	        RemoteWebDriver driver;
	       @Parameters({"URL", "browser"})
	       @BeforeTest
            public void browserInitialization(String URL, String browser)
	        {
	    	   if(browser.equalsIgnoreCase("chrome")) {
	    		WebDriverManager.chromedriver().setup();
	    		driver= new ChromeDriver();
	   			driver.get(URL);
		   
	    	   
	    	   }
			
		}

	}


