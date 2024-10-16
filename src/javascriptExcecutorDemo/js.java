package javascriptExcecutorDemo;

//java

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class js {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// Normal method to input text in a text box.
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("John");
		
// Java script Executor way- You use this way when you get element intercepted exception using normal click() or sendKeys() method
		WebElement txtbox= driver.findElement(By.xpath("//input[@id='name']"));
//As,javascriptExecutor is an interface you cannot create an object of an interface. in java you cannot directly assing the driver to the javascriptexecutor as they are not in direct parent-child relationship hence we need to do type-cast and write (JavascriptExecutor) so that we can assing the driver to the javascriptexecutor
		JavascriptExecutor js= (JavascriptExecutor)driver; 
		
		js.executeScript("arguments[0].setAttribute('value','John')", txtbox);
// In argument(0)(an arraay) the value of the webelement will be stored in this case it is txtbox.
// setAttribute is used to set the value
// in this element(txtbox) the value attribute is set to john.
		
		WebElement rdiobtn= driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", rdiobtn);
		
		}

}
