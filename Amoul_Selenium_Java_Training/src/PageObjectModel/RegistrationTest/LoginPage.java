package PageObjectModel.RegistrationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{

	WebDriver driver;


	/*
	 * By UserNamesk=By.name("//input[@name='username']"); By
	 * Passwordsk=By.name("//input[@name='password']"); By
	 * Loginbtnck=By.xpath("//button[@type='submit']");
	 */

	By UserNamesk=By.name("username");
	By Passwordsk=By.name("password");
	By Loginbtnck=By.xpath("//button[@type='submit']");

LoginPage(WebDriver d)    //Constructor for webdrviver
{
	//this.driver=driver;

	driver=d;
}


public void setuserName(String uname)
{
	driver.findElement(UserNamesk).sendKeys(uname);
}

public void setuserPassword(String upassword)
{
	driver.findElement(Passwordsk).sendKeys(upassword);
}

public void loginclick()
{
	driver.findElement(Loginbtnck).click();
}


}