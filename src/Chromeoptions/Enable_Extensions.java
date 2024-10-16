package Chromeoptions;

import java.io.File;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;

/*    
 1) Add CRX Extractor/Downloader to chrome browser (manully)
 2) Add SelectorHub plugin to chrome browser (manually)
 3) Capture CRX file for selectorhub extension
 4) Pass CRX file path in automation script in Chrome Options
*/



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Enable_Extensions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		
		ChromeOptions options= new ChromeOptions();
		
		File file= new File("/Users/samarthbhatt/Downloads/SelectorsHub.crx");
		
		options.addExtensions(file);
		
		WebDriver driver= new ChromeDriver(options);
		 driver.get("https://www.opencart.com/");
		 driver.manage().window().maximize();
		
		 
					
		

	}

}
