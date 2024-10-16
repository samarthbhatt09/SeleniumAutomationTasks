package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Switching to alert and accepting the alert----.switchTo().alert().accept();
//Switching to alert and dismissing the alert.switchTo().alert().dismiss();

public class Handling_Alerts {

			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
				WebDriver driver= new ChromeDriver();
				driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize(); 
				
				
				// Handling Alert
				
				/*driver.findElement(By.xpath("//button[normalize-space()='Alert']")).click();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();*/
				
				//Handling Confirmbox
				
				driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']")).click();
				Thread.sleep(2000);
				//driver.switchTo().alert().dismiss();
				driver.switchTo().alert().accept();
				
				//Handling Prompt
				
				/*driver.findElement(By.xpath("//button[normalize-space()='Prompt']")).click();
				Alert myprmptalert= driver.switchTo().alert();
				Thread.sleep(2000);
				myprmptalert.sendKeys("Samarth");
				myprmptalert.accept();*/
				
				
				
				
				

			}

		


	}


