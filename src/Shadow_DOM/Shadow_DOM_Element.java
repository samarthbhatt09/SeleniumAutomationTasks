package Shadow_DOM;

/*
 1)
 
 */






import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_DOM_Element {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://books-pwakit.appspot.com//");
		
		
		//This Element is inside single shadow DOM.
		String cssSelectorForHost1 = "book-app[apptitle='BOOKS']"; //This the host  of the shadow
		Thread.sleep(1000);
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot(); // From the host we go to the root of the shadow.
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#input")).sendKeys("Welcome"); // Now we have reached to the shadow tree means the desired element.

	}

}
