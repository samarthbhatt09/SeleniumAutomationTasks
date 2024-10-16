package Web_Table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination_WebTable {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 2000);");
		
		//Code to change page
		
		int total_pages=driver.findElements(By.xpath("//ul[@class='pagination']/li")).size();
		System.out.println(total_pages);
		
		for(int p = 1;p<=total_pages;p++) 
		{
		
		     if(p>1) 
		       {
			      WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']/li["+p+"]"));  //Using +p+ to change the page dynamically.
			      active_page.click();
		       }
		
		
		
		// Code to read data from the table
		int noofrows=driver.findElements(By.xpath("//div[@class='table-container']/table/tbody/tr")).size();
		
		for(int r=1; r<=noofrows; r++)
		{
		    // Getting name of product from the table
			String name=driver.findElement(By.xpath("//div[@class='table-container']//table//tbody//tr["+r+"]//td[2]")).getText();
			// Getting price of product from the table
			String price=driver.findElement(By.xpath("//div[@class='table-container']//table//tbody//tr["+r+"]//td[3]")).getText();
			driver.findElement(By.xpath("//div[@class='table-container']//table//tbody//tr["+r+"]//td[4]//input")).click();
			System.out.println(name+"/t"+ price);
			
			
		} 
		}

   }
}
