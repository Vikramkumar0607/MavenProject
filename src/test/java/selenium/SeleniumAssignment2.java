package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment2 {
	public static WebDriver driver;

	public static void main(String[] args) {
		//1. Launch browser window(Chrome)   
		driver = new ChromeDriver();
		
		//2. Maximize the browser window
		driver.manage().window().maximize();
		//3. Delete all the cookies   
		driver.manage().deleteAllCookies();
		//4. Enter URL and Launch the application (https://demoqa.com/automation-practice-form)        
		driver.get("https://demoqa.com/automation-practice-form");
		//5. Wait for Page-load
		//6. Enter First name and Last name    
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		//7. Enter Email    
		driver.findElement(By.xpath("")).sendKeys("");
		//8. Select Gender (Female)                
		//9. Enter mobile number                
		//10.Select DOB (1-Feb-1991)                
		//11.Search and Select Computer Science                
		//12.Select Hobbies as Sports and Reading                
		//13.Upload photo                
		//14. Wait till file upload                 
		//15.Submit Details                
		//16. Close browser window

	}

}
