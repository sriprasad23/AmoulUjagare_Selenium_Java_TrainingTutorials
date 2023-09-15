package TestNG_Anootations_Demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
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

	@Test
	public void classTwoTest3()
	{
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
