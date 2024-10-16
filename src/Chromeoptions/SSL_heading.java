package Chromeoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*Secure Socket Layer handling- When you are accessing some website/application on the Internet in the real time
which needs an SSL certificate.  */

public class SSL_heading {

	public static void main(String[] args) {
		
		
	   
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		
		ChromeOptions options = new ChromeOptions(); // ChromeOptions is a class.
		//options.addArguments("--headless=new"); // used to do the headless execuation.
		options.setAcceptInsecureCerts(true); //this will accept SSL certificate from the website.
	   
	    WebDriver driver= new ChromeDriver(options);// If we want to apply the above setting we need to pass the options as a paramter(ChromeDriver(options)) into the driver.
		driver.get("https://expired.badssl.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		String title=driver.getTitle();
		System.out.println("The title of the page is"+ " "+title);
		
	}

}
