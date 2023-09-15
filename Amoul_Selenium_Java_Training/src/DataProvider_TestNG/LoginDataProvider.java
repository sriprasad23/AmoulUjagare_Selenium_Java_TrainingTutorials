package DataProvider_TestNG;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProvider {


	@Test(dataProvider = "Logindataprovider")
	public void myTest1( String uName, String pwd) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Locators xpaths providing valid credentials

		WebElement txtUserName = driver.findElement(By.name("uid"));
		txtUserName.sendKeys(uName);

		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys(pwd);

		Thread.sleep(2000);
		WebElement btnLogin = driver.findElement(By.name("btnLogin"));
		btnLogin.click();

	}

/*	@Test
	public void myTest2() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));

		// Locators xpaths  Invalid credentials

		WebElement txtUserName = driver.findElement(By.xpath("//input[@name='uid']"));
		txtUserName.sendKeys("uName");

		WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("pwd");

		Thread.sleep(2000);
		WebElement btnLogin = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		btnLogin.click();
	}

	@Test
	public void myTest3() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));

		// Locators xpaths valid credentials

		WebElement txtUserName = driver.findElement(By.xpath("//input[@name='uid']"));
		txtUserName.sendKeys("");

		WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("");

		Thread.sleep(2000);
		WebElement btnLogin = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		btnLogin.click();

	}*/

	@DataProvider(name = "Logindataprovider")
	public Object [][] getData()
	{
		Object [][] data = new Object [4][2];

		data[0][0] ="mngr502613";
		data[0][1] ="UsymUsa";

		data[1][0] ="gr502613";
		data[1][1] ="UsssUsa";

		data[2][0] ="blank";
		data[2][1] ="blank123";

		data[3][0] ="";
		data[3][1] ="";

		return data ;

	}

}
