package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//We use turn on debugger which an option under selectorhub to view the hidden options and play with them.
//Removing Blur option from the event lister by inspecting the element.


public class Handling_Hidden_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
			
			
			System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
			WebDriver driver= new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();

			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();

			driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]/a")).click();
	
			driver.findElement(By.xpath("//div[@class='oxd-form-row']/div/div[3]/div/div[2]")).click();
			
			/*Click On single option          
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//span[normalize-space()='Part-Time Internship']")).click();*/
			
			//(//*[contains(text(),'Freelance')])[1] 
			
			//count number of options
			List<WebElement> options= driver.findElements(By.xpath("//div[@role='listbox']//span"));
			System.out.println( "Number of options " +options.size());
			
			//printing the options
			for(WebElement op:options) {
				System.out.println(op.getText());
			}
			

	}

}
