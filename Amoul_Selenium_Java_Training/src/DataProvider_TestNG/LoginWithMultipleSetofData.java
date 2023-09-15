package DataProvider_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithMultipleSetofData {


	@Test(dataProvider ="Credentials")
	public void verfiyLoginCredentials(String scenario, String userName, String password)
	{

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/V1/index.php");

		 driver.findElement(By.name("uid")).sendKeys(userName);


		 driver.findElement(By.name("password")).sendKeys(password);

		driver.findElement(By.name("btnLogin")).click();

	/*	if(scenario.equals("bothcorrect"))
		{

		}*/


	}

	@DataProvider(name = "Credentials")
	public Object[][] getData()
	{
		return new Object[][]
				{
			{"bothcorrect","mngr502613","UsymUsa"},
			{"bothWrong","mngr12345","UsaUsa"},
			{"CorrectUserName","mngr502613","UsaUsa"},
			{"CorrectPassword","mngr12345","UsymUsa"}
				};
	}

}
