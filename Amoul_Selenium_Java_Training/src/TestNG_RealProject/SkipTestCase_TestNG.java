/********************************************************************************************************************************************************
 Notes:
 1. We have created 3 class files to exicute we include xml file in the source folder



 ***********************************************************************************************************************************************/



package TestNG_RealProject;

import org.testng.annotations.Test;

public class SkipTestCase_TestNG {


	@Test
	public void classOneTest1()
	{
		System.out.println("classOneTest1");
	}

	// commenting will not execute but this is not good approach
/*	@Test
	public void classOneTest2()
	{
		System.out.println("classOneTest2");
	}*/

	// using enable = false we can disable the method not to run rite approach

	@Test  (enabled=false)
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
