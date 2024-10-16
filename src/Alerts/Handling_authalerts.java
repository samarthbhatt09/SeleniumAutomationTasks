package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Syntax for injecting username and password: https://username:password@the-internet.herokuapp.com/basic_auth
// Syntax of normal website: https://the-internet.herokuapp.com/
public class Handling_authalerts {


			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
				WebDriver driver= new ChromeDriver();
				//driver.get("https://the-internet.herokuapp.com/");  // Normal website
				driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");// Injecting username and password.
				driver.manage().window().maximize(); 
				
				
				
			}

		
	}


