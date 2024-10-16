package actionss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Rightclick {

	public static void main(String[] args) throws InterruptedException {
					
			System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
			WebDriver driver= new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			driver.manage().window().maximize();
			
		// Selecting the right click button	
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
       
		//Using action class to perform right click
		Actions act= new Actions(driver);
        
		Thread.sleep(2000);
        
		//Performing right click action
        act.contextClick(button).build().perform();
        
        //Selecting the copy option
       Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();
        
        //Switching to the alert and accepting the alert.
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
	}

}
