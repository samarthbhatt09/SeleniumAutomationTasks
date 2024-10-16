package actionss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//Double click= contextclick(WebElement)
//getAttribute(attribute)----returns value of attributes
//getText()----- returns inner text of WebElement

public class Handling_Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		
	//Switching to iframe	
	driver.switchTo().frame("iframeResult");
			
	//input box 1	
	WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
	//input box 2	
	WebElement box2=	driver.findElement(By.xpath("//input[@id='field2']"));
	//Clicking on the button
	WebElement button= driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

	//clearing box1
	box1.clear();
	
	//Inputting text in box1
	box1.sendKeys("Harry Potter");
	
	//Using action class to perform double click
	Actions act= new Actions(driver);
	
	//Performing double click
	//Thread.sleep(1000);
	act.doubleClick(button).build().perform();
	
	String text=box2.getAttribute("value");
	
	if(text.equals("Harry Potter")) {
		System.out.println("Double click function is working");
	} else {
		System.out.println("Double click function is not working");
	}
		
	
	
	
	
	}

}



