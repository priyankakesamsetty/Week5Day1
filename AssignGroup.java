package Week5.Day1Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AssignGroup extends ServicenowBaseclass {

	 @Test
	      public void AssignGroupTest () throws InterruptedException
	      {
		    driver.findElement(By.id("filter")).sendKeys("incident",Keys.ENTER);
			//driver.findElement(By.id("filter")).sendKeys(Keys.ENTER);
		    driver.findElement(By.xpath("(//div [text() = 'All'])[2]")).click();
		    Thread.sleep(50);
			driver.switchTo().frame("gsft_main");
			driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("INC0010018",Keys.ENTER);
			driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
			driver.findElement(By.id("lookup.incident.assignment_group")).click();	
			 Set <String > allwindows= driver.getWindowHandles();
		     System.out.println(allwindows);
		     Iterator <String> I1 = allwindows.iterator();
		     String parent_window =I1.next();
		     System.out.println(parent_window);
		     String second_window=I1.next();
		     System.out.println(second_window);
		     driver.switchTo().window(second_window);
			 driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("software",Keys.ENTER);
			 driver.findElement(By.xpath("//a[text()='Software']")).click();
			 driver.switchTo().window(parent_window);
			 driver.switchTo().frame("gsft_main");
			 driver.findElement(By.xpath("(//textarea[contains(@class,'sn-string-textarea form-control')])[3]")).sendKeys("Testdata");
			 driver.findElement(By.xpath("(//button[@name='not_important'])[2]")).click();
	} 
		

	

}
