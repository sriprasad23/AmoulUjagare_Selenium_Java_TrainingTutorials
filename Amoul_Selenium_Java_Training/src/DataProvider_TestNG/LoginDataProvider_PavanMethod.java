package DataProvider_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProvider_PavanMethod {

	@Test(dataProvider ="LoginDataProvider")
	public void dataProviderTest1(String userName, String Password) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Thread.sleep(2000);
		WebElement txtUserName = driver.findElement(By.xpath("//input[@name='uid']"));
		txtUserName.sendKeys("mngr502613");
		System.out.println(userName);

		Thread.sleep(2000);
		WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("UsymUsa");
		System.out.println(Password);

		WebElement btnLogin = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		btnLogin.click();

		System.out.println(userName+"   "+Password);

	}

	@DataProvider(name = "LoginDataProvider")
	public Object [][] getdata()
	{
		Object [][]	data = {{"mngr502613","UsymUsa"},{"mn502613","UUsa"},{"",""}};
		return data;

	}


}
