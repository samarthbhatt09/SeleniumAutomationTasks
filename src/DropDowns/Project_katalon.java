package DropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project_katalon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		
		// Getting the title of the page.
		//System.out.println(driver.getTitle());
		
		// Maximizing the window.
		driver.manage().window().maximize();
		
		driver.findElement(By.id("btn-make-appointment")).click();
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();
        
        // Handling Drop Down 
        WebElement Place= driver.findElement(By.id("combo_facility"));
        Select Facility= new Select(Place);
        Facility.selectByVisibleText("Seoul CURA Healthcare Center");
        
        // Handling Check-Box
        WebElement checkbox= driver.findElement(By.id("chk_hospotal_readmission"));
        checkbox.click();
        
  
        //Verifying if the check-box is selected
        if(checkbox.isSelected()) {
        	System.out.println("Element is checked");
        }
        else {
        		System.out.println("Element is not checked");
        }
        
        // Handling Radio Button
       WebElement rdnbtn= driver.findElement(By.id("radio_program_medicare")); //(//input[@type='radio' and contains(@value,'Medi')] way to write an xpath)
       rdnbtn.click();
       
       //Verifying if the radio button is selected
       if(rdnbtn.isEnabled()) {
    	   System.out.println("Element is pre-selected");
       }
       else {
       	   System.out.println("Element is not pre-selected");
       }
       
      driver.findElement(By.id("radio_program_medicaid")).click();
    	   
      
       
        
        // Handling Calendar
        driver.findElement(By.id("txt_visit_date")).sendKeys("02/05/2024");
        /*driver.findElement(By.id("txt_visit_date")).click();
        Thread.sleep(3000);
        String amonth= driver.findElement(By.className("datepicker-switch")).getText();
        System.out.println(amonth);
         
        
       while(amonth!=("December 2024")) {
        driver.findElement(By.className("next")).click();
        	//Thread.sleep(3000);
        	String cmonth= driver.findElement(By.className("datepicker-switch")).getText();
        	System.out.println(cmonth);
       }
        driver.findElement(By.xpath("//div[@class='datepicker-days']/table/tbody/tr[2]/td[6]")).click();*/
        	
        
        //WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']")));
       
         //Handling the Text Box
         driver.findElement(By.id("txt_comment")).sendKeys("I love you");
        
        //Clicking to book the appointment.
        driver.findElement(By.id("btn-book-appointment")).click();
        
        //Confirming that the appointment was booked
        String Confirmation=driver.findElement(By.xpath("//section[@id=\"summary\"]/div/div/div[1]/h2")).getText();
        System.out.println(Confirmation);
        
        //Going back to homepage
        driver.findElement(By.linkText("Go to Homepage")).click();
        
        Thread.sleep(2000);
       
        //Closing the browser
         driver.quit();
	
        
}   
        
	}


