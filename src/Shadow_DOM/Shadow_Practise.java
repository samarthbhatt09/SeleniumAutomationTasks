package Shadow_DOM;

/* For the Shadow element:   We cannot use X-path to get to the shadow element we need to use the css selector in order to get the shadow element, so we use selector hub to get the css selector.
  Step 1: USing selector Hub to find CSS selector we get to the shadow host. We get the shadow host as String data type. 
  Step 2: Using the selector hub to find CSS selector we get the shadow root. We get the shadow root as SearchContext data type.
  Step 3: Using selector hub to find CSS selector we get to the element or selector tree.
  
  Hierarchy for the shadow element is:
  First get the Shadow Host and then get the shadow root, from the shadow root get the shadow tree/element. 

*/



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_Practise {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://dev.automationtesting.in/shadow-dom");
		
		
		
	/*	//This Element is inside single shadow DOM......Single shadow Element 
		String cssSelectorForHost1 = "#shadow-root";
		Thread.sleep(1000);
		SearchContext shadow = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#shadow-element")).getText();;  */
		
		
  /*	//This Element is inside 2 nested shadow DOM.......Nested Shadow Element 
		String cssSelectorForHost1 = "#shadow-root";
		String cssSelectorForHost2 = "#inner-shadow-dom";
		Thread.sleep(1000); // Every DOM will be loaded step by step so their will be delay so, if we do not use thread it will give you exception
		SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		shadow1.findElement(By.cssSelector("#nested-shadow-element")).getText();;  */
		
		
		//This Element is inside 3 nested shadow DOM......Multiple nested shadow Element 
		String cssSelectorForHost1 = "#shadow-root";
		String cssSelectorForHost2 = "#inner-shadow-dom";
		String cssSelectorForHost3 = "#nested-shadow-dom";
		Thread.sleep(1000);
		SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow2 = shadow1.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		shadow2.findElement(By.cssSelector("#multi-nested-shadow-element")).getText();
		
		
		
		

	}

}
