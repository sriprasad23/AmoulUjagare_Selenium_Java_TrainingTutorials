/*
 Notes:
   The main method we wont use in Junit instead we use @Test Annotation
   add @Test annotation to the method and import the Junit package


**********************************************************************************************************************************************/



package Junit_Demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JunitDemo_1 {

	WebDriver driver;

	@Before
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@After
	public void closeBrowser() {
		driver.close();

	}

	@Test
	public void myTest1() throws InterruptedException {

		driver.get("https://demoqa.com/login");

		// Locators xpaths valid credentials

		WebElement txtUserName = driver.findElement(By.id("userName"));
		txtUserName.sendKeys("sriprasadkoushik");

		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("Dhruvanth@9");

		Thread.sleep(2000);
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id='login']"));
		btnLogin.click();

	}

	@Test
	public void myTest2() throws InterruptedException {

		driver.get("https://demoqa.com/login");

		// Locators xpaths Invalid credentials

		WebElement txtUserName = driver.findElement(By.id("userName"));
		txtUserName.sendKeys("sriprasad");

		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("Dhruvanth");

		Thread.sleep(2000);
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id='login']"));
		btnLogin.click();

	}

	@Test
	public void myTest3() throws InterruptedException {

		driver.get("https://demoqa.com/login");

		// Locators xpaths blank credentials

		WebElement txtUserName = driver.findElement(By.id("userName"));
		txtUserName.sendKeys("");

		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("");

		Thread.sleep(2000);
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id='login']"));
		btnLogin.click();

	}

}
