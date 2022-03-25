package Week5.Day1Assignment;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UpdateIncident extends ServicenowBaseclass{
        
	    @SuppressWarnings("unlikely-arg-type")
		@Test
	    public void UpdateIncidenTest() throws InterruptedException {
	    //Search Incidents
	    driver.findElement(By.id("filter")).sendKeys("incident",Keys.ENTER);
		//driver.findElement(By.id("filter")).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("(//div [text() = 'All'])[2]")).click();
	    Thread.sleep(50);
		driver.switchTo().frame("gsft_main");
		//Search for the incident
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("INC0010018",Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		System.out.println("Entered update test");
		Thread.sleep(200);
		//Select Urgency
		WebElement drpdown1= driver.findElement(By.id("incident.urgency"));
		drpdown1.click();
		Select Urgencydropdown= new Select(drpdown1);
		Urgencydropdown.selectByVisibleText("1 - High");
	    List<WebElement>Urgency= Urgencydropdown.getAllSelectedOptions();
	    String Urgencyvalue= Urgency.get(0).getText();
	    System.out.println("selected state is " +Urgencyvalue);
	    //Select state
		WebElement drpdown2= driver.findElement(By.id("incident.state"));
		drpdown1.click();
		Select Statedropdown= new Select(drpdown2);
		Statedropdown.selectByVisibleText("In Progress");
		List<WebElement>state= Statedropdown.getAllSelectedOptions();
	    String Statevalue= state.get(0).getText();
	    System.out.println("selected state is " +Statevalue);
	    driver.findElement(By.id("activity-stream-work_notes-textarea")).sendKeys("Testdata");
	    driver.findElement(By.id("sysverb_update_bottom")).click();
        /*String updatedurgency= drpdown1.getText();
        System.out.println("updates urgency is" +updatedurgency);
        String updatedstate=drpdown2.getAttribute();
        System.out.println("updated sttate is" +updatedstate);
        if(updatedurgency.equalsIgnoreCase(Urgencyvalue))
        {
        	System.out.println("urgency is updated");
        }
        else
        {
        	System.out.println("fialed updating");
        }
        if(updatedstate.equalsIgnoreCase(Statevalue))
        {
        	System.out.println("State is updated");
        }
        else
        {
        	System.out.println("State is not updated");
        }*/
	    
	    //Verify priority
	    String priority = driver.findElement(By.xpath("(//option[@selected='SELECTED'])[1]")).getText();
		 if(priority.contains("High"))
		 {
			 System.out.println("Priority is : " + priority);
		 }
		 else
		 {
			 System.out.println("Priority is not : High");
		 }
		 
		 String state1 = driver.findElement(By.xpath("(//option[@selected='SELECTED'])[2]")).getText();
		 if(state.contains("Progress"))
		 {
			 System.out.println("State is : " + state1);
		 }
		 else
		 {
			 System.out.println("State is not : In Progress");
		 }
	}
	}


