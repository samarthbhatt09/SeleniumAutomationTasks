package Browser_Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Tab_And_Windows {

	public static void main(String[] args) {
		
	
			
			System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
			WebDriver driver= new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
			
			//driver.switchTo().newWindow(WindowType.TAB);
			driver.switchTo().newWindow(WindowType.WINDOW);
			
			
			driver.get("https://demo.opencart.com/");

	}

}
