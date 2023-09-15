package DataProvider_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProvider_UsingExcelSheet {

	@Test(dataProvider = "getData1")
	public void excelTest1(String uName,String pswd)
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement txtuserName = driver.findElement(By.xpath("//input[@name='username']"));
		txtuserName.sendKeys(uName);
		WebElement txtPassword =driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys(pswd);
		WebElement btlogin =driver.findElement(By.xpath("//button[@type='submit']"));
		btlogin.click();

	}

	@DataProvider
	public Object[][] getData1() throws IOException
	{
		//1. read the file
		FileInputStream	fis = new FileInputStream("/Amoul_Selenium_Java_Training/ExcelData/DataProviderExcelSheet1.xls");

		// 2. convert file object into workbook object
		HSSFWorkbook  workbook = new HSSFWorkbook(fis);

		// Choose Sheet

		HSSFSheet sheet = workbook.getSheet("Sheet1");

		int rowcount = sheet.getPhysicalNumberOfRows();

		Object [][] dataselect = new Object[rowcount][2];    // Make it as Object instead of String

		for(int i=0; i<rowcount; i++)
		{
			HSSFRow row = sheet.getRow(i);
			dataselect[i][0]=row.getCell(0).toString().trim();
			dataselect[i][1]=row.getCell(1).toString().trim();
		}
		return dataselect;

	}

}
