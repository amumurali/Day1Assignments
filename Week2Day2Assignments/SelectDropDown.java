package Week2Day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		//WebElement source = driver.findElement(By.xpath("*[@id='j_idt87']/div/div[1]/div[1]/div/div/select"));
		WebElement source = driver.findElement(By.xpath("//select[@class = 'ui-selectonemenu']"));
		Select dd  =  new Select(source);
		//dd.selectByVisibleText("Selenium");
		dd.selectByIndex(2);
		
		//Select Country
		//source = driver.findElement(By.id("j_idt87:auto-complete_input"));
		//Select ddd = new Select(source);
		source = driver.findElement(By.xpath("//label[text()='Select Country']"));
		Select ddd = new Select(source);
		ddd.selectByVisibleText("USA");
	}
}
