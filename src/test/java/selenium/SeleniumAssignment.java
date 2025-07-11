package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

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

	}

}
