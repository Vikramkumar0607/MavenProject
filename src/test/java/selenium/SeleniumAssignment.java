package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumAssignment {
	public static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// Launch browser window
		driver = new ChromeDriver();
		// Maximize the browser window
		driver.manage().window().maximize();
		// Delete all the cookies
		driver.manage().deleteAllCookies();
		// Enter URL and Launch the application
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		// 5. Verify application title
		String actualTitle = driver.getTitle();
		String expectTitle = "ParaBank | Welcome | Online Banking";
		try {
			Assert.assertEquals(actualTitle, expectTitle);
		} catch (Exception e) {
			System.out.println("Not matching the Title");
		}
		// 6. Verify application logo
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed");
		// 7. Verify application caption
		WebElement caption = driver.findElement(By.xpath("//p[@class='caption']"));
		String actualCaption = caption.getText();
		String expectCaption = "Experience the difference";
		Assert.assertEquals(actualCaption, expectCaption);
		// 8. Enter Invalid credentials in Username and Password textboxes
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		userName.clear();
		password.clear();
		userName.sendKeys("Invalid UserName");
		// password.sendKeys("Invalid Password");
		// 9. Click on Login Button
		WebElement loginButton = driver.findElement(By.xpath("//input[@class='button']"));
		loginButton.click();
		// wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//p[@class='error']"), 0));
		// 10. Verify error message is displayed (The username and password could not be
		// verified.)
		WebElement errorMessage = driver.findElement(By.xpath("//p[@class='error']"));

		String actualMessage = errorMessage.getText();
		String expectMessage = "Please enter a username and password.";
		Assert.assertEquals(actualMessage, expectMessage);

		// 11. Click on Adminpage link
		WebElement adminlink = driver.findElement(By.xpath("//a[text()='Admin Page']"));
		adminlink.click();
		// 12. Wait for admin page
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//h1[contains(text(),'Administration')]]"), 0));
		// 13. Select Data access mode as ' SOAP'
		selectDataAccessMode("soap");
		
		// 14. Scrolldown till Loan provider
		WebElement loandprovider = driver.findElement(By.xpath("//select[@name='loanProvider']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argumennts[0].scrollIntoView(true);", loandprovider);
		// 15. Select Loanprovider as 'Web Service'
		// 16. Click on Submit button
		// 17.wait for Successful submission message
		// 18.Click on Services Link
		// 19.Wait for Services page
		// 20.Scrolldown till Bookstore services
		// 21.Get total rows, columns in the bookstore service table
		// 22.Get Column headers of book store services table
		// 23.Get all the data from book store service table
		// 24.Close browser window
		driver.close();

	}
	
	public static void selectDataAccessMode(String option) {
	  WebElement dabmode = driver.findElement(By.xpath("//input[@value='"+option+"']"));
	  dabmode.click();
		
	}

}
