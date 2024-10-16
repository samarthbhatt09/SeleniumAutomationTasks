package Chromeoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito_mode {

	public static void main(String[] args) {
		
		 
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
	  
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver= new ChromeDriver(options);
		 driver.get("https://www.opencart.com/");
		 driver.manage().window().maximize();
					
		 String pagetitle=driver.getTitle();
		 System.out.println(pagetitle);
					
		 if(pagetitle.equals("OpenCart - Open Source Shopping Cart Solution"))
			{
			 System.out.println("Title is correct");
			}  else {
			 System.out.println("Title is incorrect");			
			}
		 
					driver.quit();
			
	}
		

	}

