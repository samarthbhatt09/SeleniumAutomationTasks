package sam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class samm {






	public static void main(String[] args) throws InterruptedException {
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		WebElement textbox=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		textbox.sendKeys("Welcome");
		
		Actions act= new Actions(driver);
		
		//Cmd+A
		act.keyDown(Keys.COMMAND).sendKeys("A").keyUp(Keys.COMMAND).perform();
		
		//Cmd+C
		act.keyDown(Keys.COMMAND).sendKeys("C").keyUp(Keys.COMMAND).perform();
		
		//Tab
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//Cmd+V
		act.keyDown(Keys.COMMAND).sendKeys("V").keyUp(Keys.COMMAND).perform();
		
		

	}
	}

