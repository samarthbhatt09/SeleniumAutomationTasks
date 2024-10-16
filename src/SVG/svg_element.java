package SVG;

// In order to get the svg element you need to get the name method. The Xpath should include the name() attribute, 
//the normal xpath without the name attribute would give no such element exception.

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class svg_element {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(3000);
// the xpath should include name attribute in order to get the svg element.
		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M422,332H9')]")).click(); 
	}

}
