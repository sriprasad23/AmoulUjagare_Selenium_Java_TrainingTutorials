package Junit_Demo;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo_0 {


	@Test
	public void AT_Test()
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));

		WebElement txtuserName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		txtuserName.sendKeys("sriprasadkoushik");

		WebElement txtpswd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		txtpswd.sendKeys("Dhruvanth@9");

		WebElement btn_login = driver.findElement(By.xpath("//button[@id=\"login\"]"));
		btn_login.click();
	}
}
