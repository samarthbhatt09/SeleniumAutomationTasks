package Calander_Demo;


// If any doubts refer Date_Picker, this class is created  for creating user defined method.
// Created a user defined method in order to use the method globally.

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_picker_Global {
	
static void futuredatepicker(WebDriver driver, String Month, String year, String Date) {
		
		while(true)  
        {
        	String currentmonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentyear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
 
              if(currentmonth.equals(Month) && currentyear.equals(year)) 
            	 {	
                     break;	
                 } 
	
       driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  //next button
        }
		// driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // previous button
 
 // Selecting Date.

 List<WebElement> alldate= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a")); //getting all the dates
 
        for(WebElement dts:alldate)
 	     {
 
        	if(dts.getText().equals(Date)) 
        {
     	   dts.click();
     	   break;
        }	 
  
   }  
	
	}


static void pastdatepicker(WebDriver driver, String Month, String year, String Date) {
	
	while(true)  
    {
    	String currentmonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        String currentyear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

          if(currentmonth.equals(Month) && currentyear.equals(year)) 
        	 {	
                 break;	
             } 

    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // previous button
    }
	
// Selecting Date.
List<WebElement> alldate= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a")); //getting all the dates

    for(WebElement dts:alldate)
	     {

    	if(dts.getText().equals(Date)) 
    {
 	   dts.click();
 	   break;
    }	 

}  

}




	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0); 

		
        
        driver.findElement(By.id("datepicker")).click(); 
        
        String Month= "December";
        String year= "2022";
        String Date= "6";
        
        //futuredatepicker(driver,Month,year,Date); // for future date selection.
        pastdatepicker(driver,Month,year,Date);     // for past date selection.

	}

}
