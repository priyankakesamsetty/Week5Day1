package Week5.Day1Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
 

public class ServicenowBaseclass {
	public RemoteWebDriver driver;
	//public static String incidentNumber;
	public static String attribute;

	@BeforeMethod
	public void LaunchURL()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://dev77120.service-now.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("yaO6DqerR6SK");
		driver.findElement(By.id("sysverb_login")).click();
		
	}
	/*public void IncidentNumber()
	{
		WebElement table= driver.findElement(By.id("incident_table"));
		List<WebElement> Incident_table_Rows= table.findElements(By.tagName("tr"));
		for(int i=0;i<Incident_table_Rows.size();i++)
		{
			
			List<WebElement> Incident_table_column= driver.findElements(By.tagName("td"));
			incidentNumber= Incident_table_column.get(0).getText();
	}*/
	}

	

	


