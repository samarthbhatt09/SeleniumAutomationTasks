package Calander_Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_Dummyticket {
	
	static void datepicker(WebDriver driver, String month, String year,String date) {
		
				
				//Select Month
				WebElement Month=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
				Select selectMonth= new Select(Month);
				selectMonth.selectByVisibleText(month);
				
				//Select Year
				WebElement Year=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
				Select selectYear= new Select(Year);
				selectYear.selectByVisibleText(year);
				
				//Select Date
				List<WebElement> alldates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
				 for(WebElement dts:alldates) 
				 {
					 if(dts.getText().equals(date)) 
					  {
					     dts.click();
					     break;
				       }
				
				
				 }
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		// Selecting radio button for Dummy return ticket
		//driver.findElement(By.className("add_to_cart")).click(); 
		
	    // Providing first name 
		driver.findElement(By.id("travname")).sendKeys("Tom");
		
		//Providing last name 
		driver.findElement(By.id("travlastname")).sendKeys("Cruise");
		
		//Providing order notes
		driver.findElement(By.id("order_comments")).sendKeys("First Flight");
		
		//Inputting Date of Birth
		String month="Nov";
		String year="1997";
		String date="6";
		
		//Clicking on the DOB box
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		datepicker( driver, month, year,date);
		
		//Selecting sex-selecting male radio button
		driver.findElement(By.xpath("//input[@id='sex_1']")).click(); 	
		
		//Selecting type of trip.
		driver.findElement(By.xpath("//input[@id='traveltype_2']")).click();
		
		//Selecting origin and destination cities
		driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Toronto");
		driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Mumbai");
		
		// Departure date
		String depmonth="Nov";
		String depyear="2024";
		String depdate="23";
	
		driver.findElement(By.xpath("//input[@id='departon']")).click();
		datepicker( driver, depmonth, depyear,depdate);
		
		//Arrival date.
		
		String arvmonth="Dec";
		String arvyear="2024";
		String arvdate="29";
		
		driver.findElement(By.xpath("//input[@id='returndate']")).click();
		datepicker( driver, arvmonth, arvyear,arvdate);
		
		//Inputting additional information
        driver.findElement(By.xpath("//textarea[@id='notes']")).sendKeys("Add 3 bagages]");

        //Selecting Purpose of dummy ticket (optional)-Hidden dropdown.
        driver.findElement(By.id("select2-reasondummy-container")).click(); //opens the dropdown.
        // Select single option-Selecting prank a friend option by using debugger from the selector hub.
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[contains(text(),'Prank a friend')]")).click();
        
        //Select the notification method
        driver.findElement(By.xpath("//input[@id='deliverymethod_3']")).click();
        
        //Inputting bill name
        driver.findElement(By.id("billname")).sendKeys("Tom Cruise");
        
        //Inputting phone number
        driver.findElement(By.id("billing_phone")).sendKeys("1234567890");
       
        //Inputting email
        driver.findElement(By.id("billing_email")).sendKeys("abc@gmail.com");
        
        //Selecting country
        WebElement cntry=driver.findElement(By.id("billing_country"));
        Select selectcntry= new Select(cntry);
        selectcntry.selectByVisibleText("United States (US)");
        
        //Input street address
        driver.findElement(By.id("billing_address_1")).sendKeys("Jamesbond Street");
        driver.findElement(By.id("billing_address_2")).sendKeys("007");
        
        //Input city
        driver.findElement(By.id("billing_city")).sendKeys("Skyfall");
        
        //Select Province
        driver.findElement(By.xpath("//span[@id='select2-billing_state-container']")).click();
        driver.findElement(By.xpath("//li[contains(text(),'Arizona')]")).click();
        
        //Input postal code
        driver.findElement(By.id("billing_postcode")).sendKeys("jb007");
        
        
        
        
        
        
	    
	
	
	
	
	
	
	}

}
