package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Dropdowns {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//Select option for drop down
		
		/*WebElement drpdwn= driver.findElement(By.id("country"));
		Select ctry= new Select(drpdwn);
		//ctry.selectByVisibleText("Canada");
		//ctry.selectByIndex(1);
		//ctry.selectByValue("canada");
		
		
		//Counting number of option and printing
		
		/*List<WebElement> noofcountry=driver.findElements(By.xpath("//select[@class='form-control' and @id='country']/option"));
		for(WebElement nctry:noofcountry) {
			System.out.println(nctry.getText());*/
	
		
		//Counting number of option using for loop
		
		/*List<WebElement> optin= ctry.getOptions();
		System.out.println("Number of options are: " +optin.size()); // Printing number of the options
	
		for(int i = 0; i<optin.size(); i++) {
		  System.out.println(optin.get(i).getText());
		}*/
		
		
		List<WebElement> colors=driver.findElements(By.xpath("//select[@id='colors']/option"));
		for(WebElement op:colors) {
			String options= op.getText();
			if(options.equals("Red") || options.equals("Yellow")) {
				op.click();
			}
			//op.click();
			//System.out.println(op.getText());
		}
		
		
	}
		
	
	
		
		
		
	

}
