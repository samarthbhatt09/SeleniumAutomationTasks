package actionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


//Actions= class, will be used to perform mouse actions.
//action= interface, will used used to store and action.

public class Handling_Actions_class {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
	// Selecting the right click button	
	WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

	//Using action class to perform right click
	Actions act= new Actions(driver);
    
   //Creating right click action
   Action myAction=act.contextClick(button).build();
   
   //Performing right click
   myAction.perform();
	
	
	}

}
