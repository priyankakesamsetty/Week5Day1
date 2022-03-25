package week5Day1classroom;



import org.openqa.selenium.By;

import org.testng.annotations.Test;



public class CreateLead extends ProjectSpecificMethods{

        @Test(priority=2)
	    public void runTC001() {
		
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("second priority");
	}
        @Test(priority=1)
        
        public void runTC0001()
        {
        	System.out.println("first priority");
        }
        
        @Test(enabled=false)
        public void runenbaled()
        {
        	System.out.println("disabled");
        }
        @Test(dependsOnMethods= "week5Day1classroom.CreateLead.runTC0001")
        public void runTC0002()
        {
        	System.out.println("Checking depends on methods");
        }

}
