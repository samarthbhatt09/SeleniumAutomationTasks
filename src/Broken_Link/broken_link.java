package Broken_Link;

  /* Broken Link 
 1) We get all the links an then get href="https: xyz.com" values of all the links
 2) we get href="https: xyz.com" we connect it to server
 3) if status code grater than equal to 400 then broken link
 4)if status code less than equal to 400 then broken link
  */


import java.util.List;
import java.net.URL;
import java.time.Duration;

import javax.net.ssl.HttpsURLConnection;
import java.net.HttpURLConnection;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class broken_link {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/samarthbhatt/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		
		// Get All the Links
		  List<WebElement> links = driver.findElements(By.tagName("a")); // getting all the link on the website using tagname which is a.
		 System.out.println("total number of links "+links.size());
		 
		 int noOfBrokenLinks=0;
		 for(WebElement linkElement:links) {  // using "for" loop to put the link inside linkElement one by one from links
			String hrefvalue= linkElement.getAttribute("href"); // here we are using getAttribute method to get the value of "href" attribute.
			
			if (hrefvalue==null || hrefvalue.isEmpty()) 
			{ // now we use if condition to check if the value of href is null/empty or not
				System.out.println("href value is null or empty so it is not possible to check");
				continue; // if it is null then it should back up and check another link
			}
			
			// pass the url to the server.
			
			try {
				
			 URL linkURL = new URL(hrefvalue); // converting string type of link to URL type of link.
			 HttpURLConnection conn=(HttpURLConnection) linkURL.openConnection(); // open connection to server using openConnection method with data type as "HttpsURLConnection"
			 conn.connect(); //connect to the server.
			 
			 if(conn.getResponseCode()>=400) // if status code is more than 400 then it is broken link , if less then 400 then not broken
			 {
				 System.out.println(hrefvalue+ "=====>Broken link");
				 noOfBrokenLinks++;
			 }  else {
			     System.out.println(hrefvalue+ "=======>Not a broken link");
			         }
			 }
			
			catch(Exception e)
			{
		    }
	
				 
			 }
		System.out.println("Number of Broken link:"+noOfBrokenLinks);
			 {
		 
		 

	}

	}

}
	
