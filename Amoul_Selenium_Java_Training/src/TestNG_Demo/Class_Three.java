package TestNG_Demo;

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
		String url= "http://facebook.com";
		String userName= "sriprasad";
		String password= "Dhruvanth@9";
		System.out.println("url ="+url);
		System.out.println("userName ="+userName);
		System.out.println("password ="+password);

		System.out.println("classThreeTest2");
	}

	@Test
	public void classTwoTest3()
	{
		System.out.println("classThreeTest3");
	}

}
