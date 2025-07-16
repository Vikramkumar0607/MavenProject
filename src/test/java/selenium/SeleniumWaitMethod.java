package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.ExpectedExceptionsHolder;

public class SeleniumWaitMethod {
public static WebDriver driver;

//Implicit Wait ==> Set a Default wait thought out progress 
//Explicit Wait ==> Wait for specific elements 
//Fluent Wait ==> also most explicit wait, fluent wait every half sec it will verify the element 
	public static void main(String[] args) {
		// Launch browser window
				driver = new ChromeDriver();
				// Maximize the browser window
				driver.manage().window().maximize();
				// Delete all the cookies
				driver.manage().deleteAllCookies();
				// Enter URL and Launch the application
				driver.get("https://parabank.parasoft.com/parabank/index.htm");
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				//Explicit Wait
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//p[@class='error']"), 0));
				//Fluent Wait
				FluentWait<WebDriver> fluentwait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2));
				fluentwait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//p[@class='error']"), 0));
	}

}
