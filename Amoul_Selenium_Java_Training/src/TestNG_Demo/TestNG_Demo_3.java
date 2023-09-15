/*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 Notes:
 1. in eclipse got help > marketplace > search testng > install testng.
 2. go to mvn repository > search testng > download testng jar file of latest stable version and ADD to lib folder in eclips > testng jar file select and rite click Add to Build path
 3.


 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/


package TestNG_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Demo_3 {

	WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterClass
	public void browserClose() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void myTest_tstng1() throws InterruptedException {

		// Driver URL
		driver.get("https://demoqa.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Locators xpaths valid credentials

		WebElement txtUserName = driver.findElement(By.xpath("//*[@id='userName']"));
		txtUserName.sendKeys("sriprasadkoushik");

		WebElement txtPassword = driver.findElement(By.xpath("//*[@id='password']"));
		txtPassword.sendKeys("Dhruvanth@9");

		WebElement btnLogin = driver.findElement(By.xpath("//*[@id='login']"));
		btnLogin.click();

	}

	@Test
	public void myTest_tstng2() throws InterruptedException {

		// Driver URL
		driver.get("https://demoqa.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Locators xpaths valid credentials

		WebElement txtUserName = driver.findElement(By.xpath("//*[@id='userName']"));
		txtUserName.sendKeys("sriprasad");

		WebElement txtPassword = driver.findElement(By.xpath("//*[@id='password']"));
		txtPassword.sendKeys("Dhruva");

		WebElement btnLogin = driver.findElement(By.xpath("//*[@id='login']"));
		btnLogin.click();

	}

	@Test
	public void myTest_tstng3() {


		// Driver URL
		driver.get("https://demoqa.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Locators xpaths valid credentials

		WebElement txtUserName = driver.findElement(By.xpath("//*[@id='userName']"));
		txtUserName.sendKeys("");

		WebElement txtPassword = driver.findElement(By.xpath("//*[@id='password']"));
		txtPassword.sendKeys("");

		WebElement btnLogin = driver.findElement(By.xpath("//*[@id='login']"));
		btnLogin.click();

	}

}
