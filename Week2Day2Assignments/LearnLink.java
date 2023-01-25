package Week2Day2Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLink {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		
		//driver.findElement(By.linkText("Go to Dashboard")).click();
		WebElement homePage = driver.findElement(By.partialLinkText("Dashboard"));
		homePage.click();
		
		driver.navigate().back();
		
		WebElement whereToGo = driver.findElement(By.partialLinkText("Find the URL without "));
		String where = whereToGo.getAttribute("href");
		System.out.println("This Link is going to"+ where);

		WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
			
		brokenLink.click();
		
		String title = driver.getTitle();
		if(title.contains("404"))
		{
			System.out.println("Link is broken");	
		
		}
		driver.navigate().back();
		
		WebElement homePage1 = driver.findElement(By.partialLinkText("Dashboard"));
		homePage1.click();
		driver.navigate().back();
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));//anchor tag
		int linkCount = totalLinks.size();
		
		System.out.println("No of Links"+linkCount);
		
		
		
	
	}

}
