package Junit_Demo;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo_directLocate {


	@Test
	public void AT_Test() throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));

		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("sriprasadkoushik");


		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Dhruvanth@9");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='login']")).click();

	}
}
