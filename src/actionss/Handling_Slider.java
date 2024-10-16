package actionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Moving slider------act.dragAndDropBy(min_slider, 100, 250).perform()
//Syntax------act.dragAndDropBy (WebElement,x,y).perform()     

public class Handling_Slider {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
			WebDriver driver= new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
			driver.manage().window().maximize();
			
			WebElement min_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
					System.out.println("Current location of minslider is :"+min_slider.getLocation());
			WebElement max_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
			        System.out.println("Current location of maxslider is :"+max_slider.getLocation());
			
			        Actions act= new Actions(driver);
			        act.dragAndDropBy(min_slider, 100, 250).perform();
			        System.out.println("Location of minslider after moving:"+ min_slider.getLocation());
			        act.dragAndDropBy(max_slider, -100, 250).perform();
			        System.out.println("Location of maxslider after moving:"+ max_slider.getLocation());
			
			
	}

}
