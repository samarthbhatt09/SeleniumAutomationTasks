package javascriptExcecutorDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import screenshot.TakesScreenshort;

public class uploadfile {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		
		//single file upload
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("/Users/samarthbhatt/Downloads/Selenium Notes.pdf");
	    String ss= driver.findElement(By.xpath("//ul[@id='fileList']/li ")).getText();
		System.out.println(ss);*/
		
		//multiple files
		String file1="/Users/samarthbhatt/Downloads/Selenium Notes.pdf";
		String file2= "/Users/samarthbhatt/Downloads/Resume.pdf";
		
		// Uploading two files by using concatenate under sendKeys. We can concatenate two files by storing the location of files into a string data type 
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 +"\n"+ file2);
	
	   int NoofFileuploaded= driver.findElements(By.xpath("//ul[@id='fileList']/li")).size();
	   System.out.println(NoofFileuploaded);
	   
	   // Validation for checking number of file uploaded..
	   if(NoofFileuploaded==2) {
		   System.out.println("All files are uploaded");
	   }
	   else {
		   System.out.println("Incorrect number of files are uploaded");
	   } 
	   
	   //Validation for checking the name of the file..
	   String NameofFile1=driver.findElement(By.xpath("//ul[@id='fileList']/li[1]")).getText();
	   System.out.println(NameofFile1);
	   String NameofFile2=driver.findElement(By.xpath("//ul[@id='fileList']/li[2]")).getText();
	   System.out.println(NameofFile2);
	   
	   if(NameofFile1.equals("Selenium Notes.pdf") && NameofFile2.equals("Resume.pdf")) {
		   System.out.println("File names are matching");
	   }
	   else {
		   System.out.println("File names are not matching");
	   }   
		   
	   
		   
	   }
	
	
	
	
	
	

}
