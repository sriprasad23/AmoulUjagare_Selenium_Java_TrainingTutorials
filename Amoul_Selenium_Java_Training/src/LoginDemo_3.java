import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo_3 {

	public static void main(String[] args) throws InterruptedException {

		// Using findElement methods

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("student");
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.sendKeys("Password123");
		Thread.sleep(1000);
		WebElement subit=driver.findElement(By.id("submit"));
		subit.click();


		// Using LinkText

		WebElement clkprct=driver.findElement(By.xpath("//a[normalize-space()='Practice']"));
		Thread.sleep(2000);
		clkprct.click();

	/*	WebElement lnk=driver.findElement(By.linkText("Practice"));
		Thread.sleep(2000);
		lnk.click();*/

	}

}
