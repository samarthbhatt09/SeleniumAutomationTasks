package Calander_Demo; 

 

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		
//Switching to the frame in which the date picker is present as there is only one frame we are directly using index as 0 to switch.
		driver.switchTo().frame(0); 
		
//Method 1: Using sendkeys() if date picker is available as an input box.
       // driver.findElement(By.id("datepicker")).sendKeys("04/12/2024");
        
//Method 2: Date picker with expected data.
        
		//expected data
        String Month= "December";
        String year= "2024";
        String Date= "6";
        
        driver.findElement(By.id("datepicker")).click();  //clicking on the date picker
        
        //Selecting month and year
        
        while(true)  
        {
        	
        	
        	String currentmonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        	//System.out.println(currentmonth);
        	String currentyear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        	//System.out.println(currentyear);
        	
            if(currentmonth.equals(Month) && currentyear.equals(year)) 
            	{	
                     break;	
                } 
            	
            
/*        In the real world application date pickers can only pick a date that is for future or past.
          For date of birth kind of date picker on a application only past dates can be selected.
         For appointments kind of date picker on a application only future dates can be selected.  */ 
            
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  //next button
           // driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // previous button
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
            
}
        
		
	



                