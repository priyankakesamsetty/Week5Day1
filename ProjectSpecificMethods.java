package week5Day1classroom;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
     public RemoteWebDriver driver;
	 
     @BeforeMethod    
	 public void LaunchBrowser() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
     
     @AfterMethod
     public void CloseBrowser()
     {
    	 driver.close();
     }

}
