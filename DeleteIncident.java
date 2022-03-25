package Week5.Day1Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class DeleteIncident extends ServicenowBaseclass {
    
    @Test
    public void DeleteTest() throws InterruptedException{
    	 driver.findElement(By.id("filter")).sendKeys("incident",Keys.ENTER);
			//driver.findElement(By.id("filter")).sendKeys(Keys.ENTER);
		    driver.findElement(By.xpath("(//div [text() = 'All'])[2]")).click();
		    Thread.sleep(50);
			driver.switchTo().frame("gsft_main");
			driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("INC0010012",Keys.ENTER);
			driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
			driver.findElement(By.id("sysverb_delete_bottom")).click();
		    //driver.switchTo().frame("gsft_main");
		    driver.findElement(By.id("ok_button")).click();
		

	}

}
