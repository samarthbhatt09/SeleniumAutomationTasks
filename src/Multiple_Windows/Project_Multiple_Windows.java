package Multiple_Windows;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_Multiple_Windows {


		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();   
			
			driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
			driver.findElement(By.className("wikipedia-search-button")).click();
			
			//Counting number of links.
			List<WebElement> listResult =driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']/div/a"));
			System.out.println("The number of links is "+ listResult.size());
			
			for(WebElement link:listResult) {   // Printing and clicking the result
				String text=link.getText();
				System.out.println(text);
				link.click();
			}
			
			Thread.sleep(2000);
			
			Set<String> WindowIDs= driver.getWindowHandles(); //Getting all the window handles
			
			// Closing specific windows
			for(String WinIDs:WindowIDs) {
				String title=driver.switchTo().window(WinIDs).getTitle();
				if(title.equals("Selenium dioxide - Wikipedia") || title.equals("Selenium disulfide - Wikipedia")) {
					//System.out.println(driver.getCurrentUrl());
					driver.close();
				}
						
					
				}
			}
			
				
			

	}

