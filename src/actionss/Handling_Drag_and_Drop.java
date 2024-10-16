package actionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Handling_Drag_and_Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		
		
		WebElement WDC= driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement USA=driver.findElement(By.xpath("//div[@id='box103']"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(WDC, USA).build().perform();
		

	}

}
