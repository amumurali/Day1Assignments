package Week2Day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCheckBox {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt89\']/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[1]/label")).click();
		
	    driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[3]/label")).click();
	
		
		driver.findElement(By.xpath("//*[@id='j_idt87:ajaxTriState']/div[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt100\']/div[2]")).click();
		
		/*WebElement chbox = driver.findElement(By.id("//*[@id=\'j_idt87:j_idt102\']"));
		
		boolean b = chbox.isEnabled();
		if(b==true)
		{
			System.out.println("Enabled");
		}*/
		
	}

}
