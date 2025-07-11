package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumAssignment {

	public static void main(String[] args) {
		//Launch browser window
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Delete all the cookies
		driver.manage().deleteAllCookies();
		//Enter URL and Launch the application
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		//5. Verify application title
		String actualTitle = driver.getTitle();
		String expectTitle ="ParaBank | Welcome | Online Banking";
		try {
			Assert.assertEquals(actualTitle, expectTitle);
		} catch (Exception e) {
			System.out.println("Not matching the Title");
		}
		//6. Verify application logo
		driver.findElement(By.xpath("//img[@class=\"logo\"]"));
		//7. Verify application caption
		//8. Enter Invalid credentials in Username and Password textboxes
		//9. Click on Login Button
		//10. Verify error message is displayed (The username and password could not be verified.)
		//11. Click on Adminpage link
		//12. Wait for admin page
		//13. Select Data access mode as ' SOAP'
		//14. Scrolldown till Loan provider
		//15. Select Loanprovider as 'Web Service'
		//16. Click on Submit button
		//17.wait for Successful submission message
		//18.Click on Services Link
		//19.Wait for Services page
		//20.Scrolldown till Bookstore services
		//21.Get total rows, columns in the bookstore service table
		//22.Get Column headers of book store services table
		//23.Get all the data from book store service table
		//24.Close browser window
		driver.close();

	}

}
