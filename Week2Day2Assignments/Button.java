package Week2Day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Button {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
	    //Click and confirm the title	
		//driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
		
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		//Confirm if the button is disabled	
		 WebElement ctrlBtn = driver.findElement(By.id("j_idt88:j_idt90"));
		 boolean isDisabled = ctrlBtn.isEnabled();
		 System.out.println(isDisabled);                     
		
		//Find the position of the submit button
		 WebElement subBtn = driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[3]"));
		 Point location = subBtn.getLocation();
		 System.out.println(location);                         	
				
		//Find the Save button color
	     WebElement colrBtn = driver.findElement(By.id("j_idt88:j_idt96"));
		 String color = subBtn.getCssValue("background");
		 System.out.println(color);               

		//Find the height and width of this Submit button
		 WebElement hwBtn = driver.findElement(By.id("j_idt88:j_idt98"));
	     Dimension dimBtn = hwBtn.getSize();
	     System.out.println(dimBtn);  	
		
		//Mouse over and confirm the color changed
	     WebElement mouseHBtn = driver.findElement(By.id("j_idt88:j_idt100"));
		Actions mHover = new Actions(driver);
		mHover.moveToElement(mouseHBtn);

		
		//Click Image button and Click on any hidden button
		 driver.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();

		//How many rounded buttons r there
		//??
			
		
	}

}
