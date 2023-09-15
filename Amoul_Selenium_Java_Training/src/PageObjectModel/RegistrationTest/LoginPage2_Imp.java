package PageObjectModel.RegistrationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2_Imp
{
 WebDriver driver;


 @FindBy(how=How.NAME, using="username")  // Syntax 1 using how method
 WebElement UserName;

 @FindBy(name ="password")  // Synntax 2 its direct method and simple way
 WebElement UserPassword;

 @FindBy(xpath = "//button[@type='submit']")
 WebElement Loginbtn;

 @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
 WebElement forgotpassword;

 LoginPage2_Imp(WebDriver driver)    //Constructor for webdrviver
 {
 	PageFactory.initElements(driver, this); // additional method
 }

 public void setuserName(String fname)
 {
	 UserName.sendKeys(fname);

 }

 public void setuserPassword(String upassword)
 {
	 UserPassword.sendKeys(upassword);

 }

 public void loginclick()
 {
	 Loginbtn.click();
 }

 public void restPassword()
 {
	 forgotpassword.click();
 }







}
