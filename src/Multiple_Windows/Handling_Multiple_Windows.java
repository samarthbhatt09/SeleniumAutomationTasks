package Multiple_Windows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Windows {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			driver.findElement(By.linkText("OrangeHRM, Inc")).click();
			Set<String> WindowIDs= driver.getWindowHandles(); // Getting the window ids and storing it in a set.
			
			//Converting set to list
			List<String> windowList= new ArrayList(WindowIDs);
			String parentID= windowList.get(0);
			String ChildID= windowList.get(1);
			
			// Switch to child window
			driver.switchTo().window(ChildID);
			System.out.println(driver.getTitle());
			
			//Switch to parent window
			driver.switchTo().window(parentID);
			System.out.println(driver.getTitle());
			
			//Approach 2-----If there are more than 2 windows.
			/*for(String winID:WindowIDs) {
				String title= driver.switchTo().window(winID).getTitle();
				if(title.equals("Human Resources Management Software | OrangeHRM" || title.equals("OrangeHRM")) {
					System.out.println(driver.getCurrentUrl());*/
					
				//}
			

			// closing only the required window.
			/*for(String winID:WindowIDs) {
				String title=driver.switchTo().window(winID).getTitle();
				 if(title.equals("Human Resources Management Software | OrangeHRM")) {
					 driver.close();*/
				 }
			//}
	

		//}

	}


