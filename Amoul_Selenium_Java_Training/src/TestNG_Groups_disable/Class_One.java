/********************************************************************************************************************************************************
 Notes:
 1. We have created 3 class files to exicute we include xml file in the source folder



 ***********************************************************************************************************************************************/



package TestNG_Groups_disable;

import org.testng.annotations.Test;

public class Class_One {


	@Test
	public void classOneTest1()
	{
		System.out.println("classOneTest1");
	}

	@Test (groups = "email")
	public void classOneTest2()
	{
		System.out.println("classOneTest2");
	}

	@Test
	public void classOneTest3()
	{
		System.out.println("classOneTest3");
	}

}
