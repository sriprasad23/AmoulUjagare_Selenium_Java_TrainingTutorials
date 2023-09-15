package PageObjectModel.RegistrationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPassword
{
	WebDriver driver;

	@FindBy(xpath= "//input[@placeholder='Username']")
	WebElement FUserName;

	@FindBy(xpath = "//button[normalize-space()='Reset Password']")
	WebElement ResetPassword;

	ResetPassword(WebDriver driver)
	{
		PageFactory.initElements(driver, this); // additional method
	}

	public void setForgotUserName(String Funame)
	{
		FUserName.sendKeys(Funame);
	}

	public void restPasswordbtn()
	{
		ResetPassword.click();
	}



}
