package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Bootstrap_dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		////button[contains(@class,'multiselect')]
		
		//Selecting single option
		
		/*driver.findElement(By.xpath("//input[@value='Java']")).click();*/
		
		//Capture all the options and find out the size
		List<WebElement> drpdwn=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Number of Options:" +drpdwn.size());
		
		//Print all the options
		
		/*for(WebElement options:drpdwn) {
			System.out.println(options.getText());
		}*/
		
		
		//Select multiple options
		
		
		/*for(WebElement options:drpdwn) {
			
		String op= options.getText();
		
		if(op.equals("Java") || op.equals("Python")) {
			
			options.click();
		}
		
		}*/
	}
}
