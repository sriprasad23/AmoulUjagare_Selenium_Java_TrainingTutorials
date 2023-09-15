package TestNG_Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Demo {

	@Test
	public void myLoginTest() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Driver URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Locators xpaths valid credentials

		WebElement txtUserName = driver.findElement(By.name("username"));
		txtUserName.sendKeys("Admin");

		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("admin123");

		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		btnLogin.click();

		String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actual = driver.getCurrentUrl();

		System.out.println("expected:   "+expected);
		System.out.println("actual:   "+actual);

		String expectedtitle = "OrangeHRM";
		String actualtitle = driver.getTitle();

		System.out.println("expectedtitle:   "+expectedtitle);
		System.out.println("actualtitle:   "+actualtitle);


		String Expectedtxt ="Dashboard";

		String actualtxt = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText();

		System.out.println("expectedText:   "+Expectedtxt);
		System.out.println("actualtxt:   "+actualtxt);

		Assert.assertEquals(actual, expected, "This is not a dashboard");
		Assert.assertEquals(actualtitle, expectedtitle, "This is not an Title");
		Assert.assertEquals(actualtxt, Expectedtxt, "This is Not exepected Text");



	}



}
