package Week2Day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

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
		
		//Click Contacts Tab
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		
		//Enter Firstname
		 driver.findElement(By.id("firstNameField")).sendKeys("Amudha");
		
		//enter Last name
		driver.findElement(By.id("lastNameField")).sendKeys("Sundaramurthy");
			
		//	Click Create Contact Button
		driver.findElement(By.className("smallSubmit")).click();	
		
		String title = driver.getTitle();
		System.out.println(title);		
		
		//Print the first name and browser title
		System.out.println(driver.findElement(By.id("viewContact_firstName_sp")).getText());
				
		
		//Close the browser*/
		driver.close();
		

	}

}
