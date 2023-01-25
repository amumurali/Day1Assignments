package Week2Day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		 
		driver.findElement(By.name("firstname")).sendKeys("Amudha");
		
		driver.findElement(By.name("lastname")).sendKeys("Sundaramurthy");
		
		driver.findElement(By.name("reg_email__")).sendKeys("amudhas.muralidharan@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("amudhas.muralidharan@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("am26mu13");
		
		WebElement Day = driver.findElement(By.name("birthday_day"));
		Select dDay = new Select(Day);
		dDay.selectByIndex(25);
		
		WebElement mMonth=driver.findElement(By.name("birthday_month"));
		Select mm=new Select(mMonth);	
		mm.selectByVisibleText("Jun");
		
		WebElement Year=driver.findElement(By.name("birthday_year"));
		Select yy=new Select(Year);		
		yy.selectByValue("1973");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
	}
}
