package Web_Table;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTable_Project {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		WebElement depcity=driver.findElement(By.name("fromPort"));
		Select selectdep= new Select(depcity);
		selectdep.selectByVisibleText("Philadelphia");
		WebElement descity=driver.findElement(By.name("toPort"));
		Select selectdes=new Select(descity);
		selectdes.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		//Total number of rows
		int noofrows=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
	//	System.out.println("Total number of rows: "+noofrows);
		
/*  List<WebElement> priceElements = driver.findElements(By.xpath("//table//tr/td[6]"));

        // Create an ArrayList to store the prices
        ArrayList<Double> prices = new ArrayList<>();

        // Loop through the list of price elements
        for (WebElement priceElement : priceElements) 
        {
            // Get the text of each price, remove the $ symbol, convert it to double, and store it in the ArrayList
            String priceText = priceElement.getText().replace("$", ""); // Removing $ symbol
            double priceValue = Double.parseDouble(priceText);
            prices.add(priceValue);
        }

        // Print the prices before sorting (optional)
        System.out.println("Prices before sorting: " + prices);

        // Sort the prices in ascending order
        Collections.sort(prices);

        // Print the sorted prices
        System.out.println("Prices after sorting (ascending order): " + prices);

		
	}*/
		ArrayList<Double> prices = new ArrayList<>();
		
		
		for(int r=1; r<=noofrows ;r++) 
		{
				String pricetext= driver.findElement(By.xpath("//table//tr["+r+"]/td[6]")).getText().replace("$", "").trim();
				Double pricevalue=Double.parseDouble(pricetext);
         		prices.add(pricevalue);
				continue;
				
		}
		
		 // Print the prices before sorting (optional)
        System.out.println("Prices before sorting: " + prices);

        // Sort the prices in ascending order
        Collections.sort(prices);
        
        // Print the sorted prices
        System.out.println("Prices after sorting (ascending order): " + prices);
        
        if(prices.isEmpty()) 
          {
     	     System.out.println("No values in the list");
          } 
        else 
           {
        	double lowestprice=prices.get(0);
     	    System.out.println("Cheapest price" +lowestprice);
     	    
     	    
     	   for (int d = 1; d <= noofrows; d++) {
               String pricetext = driver.findElement(By.xpath("//table[@class='table']//tbody//tr[" + d + "]/td[6]")).getText().replace("$", "").trim();
               Double pricevalue = Double.parseDouble(pricetext);
         

              if (pricevalue==lowestprice) { // Use equals for Double comparison
               
               driver.findElement(By.xpath("//table[@class='table']//tbody//tr[" + d + "]/td[1]//input")).click();
                   System.out.println("Clicked the flight with the lowest price: $" + lowestprice);
                   break;         
   		
   		}   
            
       
           
	              
        driver.findElement(By.id("inputName")).sendKeys("Tom");
        driver.findElement(By.id("address")).sendKeys("address");
        driver.findElement(By.id("city")).sendKeys("city");
        driver.findElement(By.id("state")).sendKeys("state");
        driver.findElement(By.id("zipCode")).sendKeys("zipCode");
        driver.findElement(By.id("creditCardMonth")).sendKeys("dec");
        driver.findElement(By.id("creditCardYear")).sendKeys("2001");
        driver.findElement(By.id("nameOnCard")).sendKeys("tom cruise");
        driver.findElement(By.id("rememberMe")).click();
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
        
        String pymtcrmmsg= driver.findElement(By.xpath("//div[@class='container hero-unit']//h1")).getText();
        System.out.println(pymtcrmmsg); 

        
	}
}
        
	

		
		
		
		 

       // Arrays.sort(elementsArray);
        
        
	
	        
	
	
	
	
	
	
	

	


