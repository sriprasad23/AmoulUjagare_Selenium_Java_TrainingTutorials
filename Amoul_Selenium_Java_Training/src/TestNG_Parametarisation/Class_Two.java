package TestNG_Parametarisation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class_Two {


	@BeforeTest
	public void beforeMyTest()
	{
		System.out.println("beforeMyTest");
	}

	@AfterTest
	public void afterMyTest()
	{
		System.out.println("afterMyTest");
	}


	@Test
	public void classTwoTest1()
	{

		System.out.println("classTwoTest1");
	}

	@Parameters({"myUrl","myUsername","myPassword"}) // case sencitve should be exact as in xml given
	@Test
	public void classTwoTest2(String url1, String userName, String password)
	{
		String url= url1;
		/*	String userName= "sriprasad";
			String password= "Dhruvanth@9";*/
			System.out.println("url ="+url);
			System.out.println("userName ="+userName);
			System.out.println("password ="+password);
		System.out.println("classTwoTest2");
	}

	@Test
	public void classTwoTest3()
	{
		System.out.println("classTwoTest3");
	}



}
