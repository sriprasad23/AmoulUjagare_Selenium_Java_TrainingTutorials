package TestNG_Assertions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddCustomer_Assertions {

	@Test
	public void addCustomer1() throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/telecom/addcustomer.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));

		driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("sri");
		driver.findElement(By.xpath("//*[@id=\"lname\"]")).sendKeys("prasad");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sriprasadkoushik.r@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Sksbcaskdalsjdawda");
		driver.findElement(By.xpath("//*[@id=\"telephoneno\"]")).sendKeys("9739911088");
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		String expectedMessage = "Mobile no must not be blank";
		String actualMessage="";

		try {
		actualMessage = driver.findElement(By.xpath("//label[@id='message7']")).getText();
		}
		catch (Exception e)
		{
			System.out.println("Exception handled");
		}
		System.out.println("expectedMessage = "+expectedMessage);
		System.out.println("actualMessage  ="+actualMessage);

		Assert.assertEquals(actualMessage, expectedMessage, "Field should not be empty");



	}



}
