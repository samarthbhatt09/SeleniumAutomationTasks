package Checkbox_Radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlig_checkbox_radiobutton {

	
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
	    	   
	      //Closing the browser
	         driver.quit();
	}

}
