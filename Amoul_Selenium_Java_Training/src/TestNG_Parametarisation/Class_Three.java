package TestNG_Parametarisation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class_Three {


	@Test
	public void classTwoTest1()
	{
		System.out.println("classThreeTest1");
	}

	@Test
	public void classTwoTest2()
	{
		System.out.println("classThreeTest2");
	}

	@Parameters({"myUrl","myUsername","myPassword"}) // case sencitve should be exact as in xml given
	@Test
	public void classTwoTest3(String url1, String userName, String password)
	{
		String url= url1;
		/*	String userName= "sriprasad";
			String password= "Dhruvanth@9";*/
			System.out.println("url ="+url);
			System.out.println("userName ="+userName);
			System.out.println("password ="+password);
		System.out.println("classThreeTest3");
	}

	@BeforeSuite
	public void beforeMySuite()
	{
		System.out.println("beforeMySuite");
	}

	@AfterSuite
	public void afterMySuite()
	{
		System.out.println("afterMySuite");
	}


}
