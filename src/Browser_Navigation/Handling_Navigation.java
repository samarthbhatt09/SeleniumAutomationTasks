package Browser_Navigation;


import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


// Navigate to a application----.navigate().to("https://demo.nopcommerce.com/");
//Navigate back----.navigate().back(); go back to nopcommernce application.
//Navigate forward----.navigate().forward(); go forward to orangehrm application.
//Command to refresh---.navigate().refresh();// refresh the windows.

public class Handling_Navigation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
	
		/*URL myurl= new URL("https://demo.nopcommerce.com/");   //Going to the URL by creating the URL object.
		driver.navigate().to(myurl);*/
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back(); //go back to nopcommernce application
		System.out.println(driver.getCurrentUrl()); 
		driver.navigate().forward(); // go forward to orangehrm application.
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();// refresh the windows.

	}

}
