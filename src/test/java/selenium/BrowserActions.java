package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActions {

	public static void main(String[] args) {
		// 1. Lunch the browser windows (Browser = Chrome)
		WebDriver driver = new ChromeDriver();

		// 2. Minimize browser window
		// driver.manage().window().minimize();

		// 3.Maximise to specific resolution(800X400)
		///driver.manage().window().setSize(new Dimension(430, 932));

		// 4.Maximize the browser windows
		driver.manage().window().maximize();

		driver.get("https://nss.nexterp.in");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9347726297");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Next@2007");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		
		
	}

}
