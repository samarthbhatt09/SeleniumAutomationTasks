package Calander_Demo;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_Picker_Monthissue_Demo {
	
	// Creating a user defined method to convert the string into object.
	
	static Month convmonth(String month) {    // Month(pre-defined class in Java.util)
		
		
		HashMap<String, Month> monthmap= new HashMap<String, Month>();
		monthmap.put("January", Month.JANUARY);
		monthmap.put("February", Month.FEBRUARY);
		monthmap.put("March", Month.MARCH);
		monthmap.put("April", Month.APRIL);
		monthmap.put("May", Month.MAY);
		monthmap.put("June", Month.JUNE);
		monthmap.put("July", Month.JULY);
		monthmap.put("August", Month.AUGUST);
		monthmap.put("September", Month.SEPTEMBER);
		monthmap.put("Octer", Month.OCTOBER);
		monthmap.put("November", Month.NOVEMBER);
		monthmap.put("December", Month.DECEMBER);
		
		Month vMonth= monthmap.get(month);
		
		if(vMonth == null) 
		{
			System.out.println("invalid month..");
		}
		    return vMonth;
	    }
		


	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		// Expected Date.
		String requiredMonth= "January";
        String requiredYear= "2025";
        String requiredDate= "6";
        
       // Using  JavascriptExecutor in order to scroll the window/page.
       JavascriptExecutor js= (JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(0,500)"); 
       driver.findElement(By.id("txtDate")).click();
       
       // Using select method to select the year by (selectByVisibleText)
       WebElement selectyear= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
       Select year= new Select(selectyear);
       year.selectByVisibleText(requiredYear); // inputting (requiredYear) as we want to get the value 2022 that we declared above. 
       
       //Method 1-Select Month.
       
      while(true) 
      {
       String displaymonth=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).getText();
       
       
       //Convert displaymonth and requiredMonth into Month(pre-defined class in Java.util) Object type by calling the method we created above. .
       
       Month expectedMonth= convmonth(requiredMonth);  
       Month currentMonth= convmonth(displaymonth);
       
       // Now comparing currentmonth and expectedmonth
            /*Comparing method will return either <0 ,>0 or 0. 
              If it is >0 it means it is in the future month
              If it is <0 it means it is past month
              If it is 0 it means the value is same month.    */
       
       if (expectedMonth != null && currentMonth != null) {
    	    int result = expectedMonth.compareTo(currentMonth);
    	    // Continue with your logic
    	} else {
    	    // Handle the case where one or both months are null
    	    if (expectedMonth == null) {
    	        System.out.println("expectedMonth is null");
    	    }
    	    if (currentMonth == null) {
    	        System.out.println("currentMonth is null");
    	    }
    	}
       
    	 int result =expectedMonth.compareTo(currentMonth); 
    	    
    	   if(result<0)
    	      {
    	   
    	    	 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
    	   
              } else if(result>0) 
                 {
                    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
       
                 } else
                    {
                	  break;
                    }

	            } //while loop ends. 
       
       
  /*     // Method 2- Selecting month
       WebElement selectmonth= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
       Select month= new Select(selectmonth);
       month.selectByVisibleText(requiredMonth); */
        
    // Selecting date.
       // Getting all the dates
       List<WebElement>  alldate= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
          
          for(WebElement dt:alldate) {
        	  if(dt.getText().equals(requiredDate))  
        	  {
        		  dt.click();
        		  break;
        	  }
        	  
          }
          
	
	
	}
}
