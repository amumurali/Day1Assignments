package Week2Day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {

		//Launch the URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Enter username and password using idLocater and Click Login button
		driver.findElements(By.id("username"));		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on Leads button
	    driver.findElement(By.linkText("Leads")).click();
		
		//click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				
		//Enter Firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Amudha");
		
		//enter Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sundaramurthy");
		
		//Enter First Local Name
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ammu");
		
		//Enter Department
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Science");
		
		//Enter Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Comp.Scien. Engg. Deparmt");	
		
		//Click CreateLead
		//driver.findElement(By.className("smallSubmit")).click();
		
		
		 //Enter your email in the E-mail address Field using the locator of your choice
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("amudhas.muralidharan@gmail.com");
		
		 //Click on CreateLead Button
		driver.findElement(By.className("smallSubmit")).click();     
		
		//Get the title of the resulting page
		String title = driver.getTitle();
		System.out.println(title);		

			
	}

}
