package Week5.Day1Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateIncident extends ServicenowBaseclass{
	String incidentNumber;
	 String CreatedIncidentnumber;
	@Test
	public void CreateIncidentTest() throws InterruptedException {
		//Enter Incident in filter navigator and press enter
		driver.findElement(By.id("filter")).sendKeys("incident");
		Thread.sleep(50);
		driver.findElement(By.id("filter")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//div [text() = 'All'])[2]")).click();
		//Click on Create new option and fill the manadatory fields
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//button [@id = 'sysverb_new']")).click();
        driver.findElement(By.xpath("//button[@id = 'lookup.incident.caller_id']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String parent_window = iterator.next();
		String child_window = iterator.next();
		driver.switchTo().window(child_window);
		String callerName = driver.findElement(By.xpath("(//a [@class ='glide_ref_item_link'])[1]")).getText();
		System.out.println(callerName);
		driver.findElement(By.xpath("(//a [@class ='glide_ref_item_link'])[1]")).click();
		driver.switchTo().window(parent_window);
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//input [@id = 'incident.short_description']")).sendKeys("createIncident");
		WebElement incidentValue = driver.findElement(By.xpath("//input[@id='sys_original.incident.number']"));
		String incidentNumber = incidentValue.getAttribute("value");
		System.out.println("The newly created incident number is : " +incidentNumber);
		driver.findElement(By.xpath("//button[@id=\"sysverb_insert_bottom\"]")).click();
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(incidentNumber,Keys.ENTER);
		String CreatedIncidentnumber= driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		  WebElement incidentnumber = driver.findElement(By.xpath("//input[@name='incident.number']"));
		  attribute = incidentnumber.getAttribute("Value");
		  System.out.println(attribute);
		//Verify the newly created incident ( copy the incident number and paste it in search field and enter then verify the instance number created or not)
		if(incidentNumber.equalsIgnoreCase(CreatedIncidentnumber))
		{
			System.out.println("Incident is created");
		}
		else
		{
			System.out.println("Incident creation failed");
		}
		
		

	}

}
