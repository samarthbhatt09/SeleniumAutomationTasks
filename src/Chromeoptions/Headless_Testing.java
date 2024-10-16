package Chromeoptions;

// We can do multiple tasks since the execution happens in the background.
// faster executions 
//User cannot see the action on the page , so the user cannot understand flow/functionality of the test.
//

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Testing {

	public static void main(String[] args) {
		
			
			
// creating an object called options for calling methods from chromeoptions
			ChromeOptions options= new ChromeOptions(); 
// We use method called addArguments to pass the parameter to make it headless, in order to make it headless we need to pass a paramter "--headless=new"
			options.addArguments("--headless=new");  //setting for headless mode of execution
			
			
           System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
			
// We need to pass the object that we created for the ChromeOptions class called options into the webrive so that the setting that we wrote above can be applied to the driver.
			WebDriver driver= new ChromeDriver(options);
			driver.get("https://www.opencart.com/");
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			
			
			String pagetitle=driver.getTitle();
			System.out.println(pagetitle);
			
			if(pagetitle.equals("OpenCart - Open Source Shopping Cart Solution"))
			{
				System.out.println("Title is correct");
			}  else {
				System.out.println("Title is incorrect");
				
			}
			
         driver.quit();
	}

}
