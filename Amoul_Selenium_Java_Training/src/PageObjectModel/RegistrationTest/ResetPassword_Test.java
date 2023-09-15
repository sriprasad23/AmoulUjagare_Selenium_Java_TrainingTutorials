package PageObjectModel.RegistrationTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ResetPassword_Test
{
	@Test
	public void ForgotPasswordtest()
	{
		WebDriver driver = new ChromeDriver();

		LoginPage2_Imp RGPage = new LoginPage2_Imp(driver);

		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.manage().window().maximize();

		  RGPage.restPassword();

		  ResetPassword resetpwd= new ResetPassword(driver);

		  resetpwd.setForgotUserName("Admin");
		  resetpwd.restPasswordbtn();



	}









}
