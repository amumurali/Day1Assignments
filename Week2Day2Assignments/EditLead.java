package Week2Day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElements(By.id("username"));		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
				
		driver.findElement(By.linkText("CRM/SFA")).click();
				
		driver.findElement(By.linkText("Leads")).click();
				
		driver.findElement(By.linkText("Find Leads")).click();
	
		driver.findElement(By.name("firstName")).sendKeys("Amudha");
		
		driver.findElement(By.linkText("Find Leads")).click();
				
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10409']")).click();
	
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("AmmuNewCompany");
		
		driver.findElement(By.className("smallSubmit")).click();
	}

}

