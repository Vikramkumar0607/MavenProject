package selenium;

import java.awt.Checkbox;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAssignment2 {
	public static WebDriver driver;

	public static void main(String[] args) {
		// 1. Launch browser window(Chrome)
		driver = new ChromeDriver();

		// 2. Maximize the browser window
		driver.manage().window().maximize();
		// 3. Delete all the cookies
		driver.manage().deleteAllCookies();
		// 4. Enter URL and Launch the application
		// (https://demoqa.com/automation-practice-form)
		driver.get("https://demoqa.com/automation-practice-form");
		// 5. Wait for Page-load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// 6. Enter First name and Last name
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		firstName.sendKeys("Vikram");
		lastName.sendKeys("M");
		// 7. Enter Email
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("vkumarm@gmail.com");
		// 8. Select Gender (Female)
		checkbox("Male");
		// 9. Enter mobile number
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobileNumber.sendKeys("9989682138");
		// 10.Select DOB (1-Feb-1991)
		//selectDOB("1", "February", "1991");
		selectDOB("1","February","1991");
		// 11.Search and Select Computer Science
		SelectSubject("Computer Science");

		// 12.Select Hobbies as Sports and Reading
		String[] hobbies = { "Reading", "Sports" };
		selectHobbies(hobbies);
		// 13.Upload photo
		String FilePath = System.getProperty("user.dir" + "\\Files\\imageFile.jpg");
		WebElement uploadPhoto = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		uploadPhoto.sendKeys(FilePath);
		// 14. Wait till file upload
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// 15.Submit Details
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", submit);

		// 16. Close browser window
		driver.close();

	}

	public static void checkbox(String gender) {
		WebElement gendercheckbox = driver.findElement(By.xpath("//label[text()='" + gender + "']"));
		gendercheckbox.click();
	}

	public static void selectHobbies(String[] options) {
		for (String option : options) {
			WebElement hobbiescheckbox = driver.findElement(By.xpath("//label[text()='" + options + "']"));
			if (!hobbiescheckbox.isSelected()) {
				hobbiescheckbox.click();

			}
		}
	}

	public static void selectDOB(String date, String month, String year) {
		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions
				.numberOfElementsToBeMoreThan(By.xpath("//select[@class='react-datepicker__month-select']"), 0));

		// Select Month
		WebElement months = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select selectMonth = new Select(months);
		selectMonth.selectByVisibleText(month);

		// select Year
		WebElement years = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select selectYear = new Select(years);
		selectYear.selectByVisibleText(year);
		

		// Select Date
		WebElement datefiled = driver
				.findElement(By.xpath("//div[contains(@aria-label,'" + month + "')and text()='" + date + "']"));
		datefiled.click();

	}

	public static void SelectSubject(String subjectName) {

		WebElement subjectInput = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", subjectInput);

		// Enter Subject Name
		Actions action = new Actions(driver);
		action.sendKeys(subjectInput, subjectName).perform();

		// Wait statement
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
				By.xpath("//div[text()='" + subjectName + "' and contains(@id,'option')]"), 0));

		WebElement suggestion = driver
				.findElement(By.xpath("//div[text()='" + subjectName + "' and contains(@id,'option')]"));
		suggestion.click();
	}

}
