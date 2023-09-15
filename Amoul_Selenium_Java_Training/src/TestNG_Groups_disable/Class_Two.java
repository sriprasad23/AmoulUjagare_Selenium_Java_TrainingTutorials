package TestNG_Groups_disable;

import org.testng.annotations.Test;

public class Class_Two {


	@Test
	public void classTwoTest1()
	{
		System.out.println("classTwoTest1");
	}

	@Test (groups = "email")
	public void classTwoTest2()
	{
		System.out.println("classTwoTest2");
	}

	@Test
	public void classTwoTest3()
	{
		System.out.println("classTwoTest3");
	}

}
