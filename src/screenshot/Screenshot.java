package screenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// /Users/samarthbhatt/eclipse-workspace/SeleniumAutomationTasks/src/screenshot/fullpage.png
public class Screenshot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		//1) Capturing full page
		
//As TakesScreenshotis an interface that has no relationship with any other interface(in this case WebDriver) we would need to do typecasting((TakesScreenshot)driver).
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		
//Now we use a method from ts variable know as getScreenshotAs, in this we have to specify which format do we want the file in so we use parameter OutputType and set it to File. 
		File sourceFile= ts.getScreenshotAs(OutputType.FILE); // this will return "file" type of object as we are capturing the screenshot in form of file so we create a file type variable(File sourceFile).

//Now we have captured the screenshot in the file form but we do not know where is the captured screenshot stored in memory so we create a targetfile providing location of where we want the screenshot file to be store
		File TargetFile= new File("/Users/samarthbhatt/eclipse-workspace/SeleniumAutomationTasks/src/screenshot/fullpage.png");// we create a new file object to specify location.

		// Copy source file to targetfile.		
		sourceFile.renameTo(TargetFile);*/
		
		
		//2) Capturing the screenshot of specific section
		
	/*	WebElement specificsection= driver.findElement(By.xpath("//h1[normalize-space()='Peace of mind is just a few clicks away!']"));
		File sourcefile= specificsection.getScreenshotAs(OutputType.FILE);
		File targetfile= new File("/Users/samarthbhatt/eclipse-workspace/SeleniumAutomationTasks/src/screenshot/specificsection.png");
		sourcefile.renameTo(targetfile);   */
		
		//3) Capturing logo on the symbol
		
		
		WebElement logo= driver.findElement(By.xpath("//img[@src='/public/_resources/themes/orangehrm/dist/images/OrangeHRM_Logo.svg']"));
		File sourcefile= logo.getScreenshotAs(OutputType.FILE);
		File targetfile= new File("/Users/samarthbhatt/eclipse-workspace/SeleniumAutomationTasks/src/screenshot/logo.png");
		sourcefile.renameTo(targetfile);
		driver.quit();

		
	
		
	}

}
