package Web_Table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1300);");
		
		
	//Total no. of rows
		int noofrows= driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
		System.out.println("Number of rows: " +noofrows);
		
		//Total number of column.
		int noofcolumn= driver.findElements(By.xpath("//table[@name='BookTable']//tbody/tr[1]/th")).size();
		System.out.println("Number of column: " +noofcolumn);
		
		/*		//read specific data from the table(Read date "Master In Selenium" present from the table)
		String bookname= driver.findElement(By.xpath("//table[@name='BookTable']//tbody/tr[5]//td[1]")).getText(); //Master In Selenium.
		System.out.println(bookname);
		
		//read specific data from the table(Read date "Javascript" present from the table)
		String subject= driver.findElement(By.xpath("//table[@name='BookTable']//tbody/tr[7]//td[3]")).getText();
		System.out.println(subject);
		
		//read data from all rows and column.
		
		for(int r=2; r<=noofrows ;r++) 
		{
			for(int c=1; c<=noofcolumn; c++) 
			{
				String value= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
				System.out.println(value+"/t" );
			}
			    System.out.println();
		}   */
		
/*		//read book name whose author is "Mukesh".
		for(int r=2;r<=noofrows;r++) 
		{
			String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+r+"]/td[2]")).getText();
			if(authorname.equals("Mukesh")) 
			{
				String bookname= driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+r+"]/td[1]")).getText();
				System.out.println(bookname +"/t"+authorname );
			}
		}      */
		
/*		//Find the total price of all the books.
		int total=0;
		for(int r=2;r<=noofrows;r++) 
		{
			String allprice= driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+r+"]/td[4]")).getText();
			total=total+Integer.parseInt(allprice);
			
		}
		
		System.out.println("Total price: "+total);
		
		

} */
}
	
}

