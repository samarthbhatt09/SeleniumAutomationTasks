package Heatmap_windowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class heatmaps {
		
		

			public static void main(String[] args) throws InterruptedException {
			// Create a new ChromeDriver instance
			System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			// Open the page
			driver.get("https://app.vwo.com/#/analyze/osa/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2Nj\n"
					+ "Y0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ\n"
					+ "0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2\n"
					+ "N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnl\n"
					+ "y=1Use");
			//Store the handle of the current window
			String mainWindowHandle = driver.getWindowHandle();
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.cssSelector("[data-qa=\"meqeqiwiwe\"]"))).click().build().perform();
			 //yedexafobi
			// Store the handles of all open windows in a list
			Set<String> windowHandles = driver.getWindowHandles();
			System.out.println(windowHandles);
			Iterator<String> iterator = windowHandles.iterator();
			// Here we will check if child window has other child windows and will fetch the heading of the child window
			while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
			driver.switchTo().window(ChildWindow);
			System.out.println(ChildWindow);
			driver.switchTo().frame("heatmap-iframe");
			
			
			driver.findElement(By.cssSelector("[data-qa=\"liqokuxuba\"]")).click();
			}
			}
			// Close the web driver
		 //driver.quit();
			}

}


