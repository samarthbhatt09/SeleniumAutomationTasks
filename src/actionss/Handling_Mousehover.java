package actionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// MouseHover can be handled using moveToElement method from the Actions pre-defined class.
//Every actions class method implementations needs build() and perform()

public class Handling_Mousehover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement desktop=driver.findElement(By.linkText("Desktops"));
		//Thread.sleep(2000);
		WebElement Mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(desktop).moveToElement(Mac).click().build().perform();
		

	}




	}


