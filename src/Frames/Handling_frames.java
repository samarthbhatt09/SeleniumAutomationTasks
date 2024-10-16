package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_frames {
	
	
	    // When multiple webpages are embedded into one webpage then it becomes frames.Iframe is a frame inside the frame.
	    //driver.switchTo().frame(id);---Use when id attribute of the frame is available.
	    //driver.switchTo().frame(name);----Use when name attribute of the frame is available.
	    //driver.switchTo().frame(Webelement);---- Use when name and id of the frame is not available.
	    //driver.switchTo().frame(index);--- Use index when only 1 iframe is available in the frame.

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize(); 
		
		//Frame 1
	    WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("mytext1")).sendKeys("Harry Potter");
		
		driver.switchTo().defaultContent(); // go back to the main page
		
		//Frame 2
		WebElement frame2= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("mytext2")).sendKeys("Hogwarts");
		
		driver.switchTo().defaultContent(); // go back to the main page
		
		//Frame 3
		WebElement frame3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.name("mytext3")).sendKeys("Magic Wand");
		
		driver.switchTo().frame(0);  //Switching to the iframe using index as there is only 1 frame inside the frame 3
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='i8']/div[3]/div")).click();
		
		driver.switchTo().defaultContent();
		
		//Frame 5
		WebElement frame5= driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.name("mytext5")).sendKeys("Magic");
		Thread.sleep(2000);
		driver.findElement(By.linkText("https://a9t9.com")).click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;  
		//js.executeScript(,Arguments);
		
		driver.switchTo().frame(0); //Switching to the iframe using index as there is only 1 frame inside the frame 3
		
		WebElement image=driver.findElement(By.xpath("//img[@class='responsive-img' and @src='/Content/Images/ui.vision.logo2.webp']"));
		if(image.isDisplayed()) 
		{
			System.out.println("Image is present"); 
		}
		else 
		{		
			System.out.println("Image is not present");
		}
	}


}
		
		

	


	


