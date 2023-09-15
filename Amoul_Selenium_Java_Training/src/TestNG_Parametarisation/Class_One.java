/********************************************************************************************************************************************************
 Notes:
 1. We have created 3 class files to exicute we include xml file in the source folder



 ***********************************************************************************************************************************************/



package TestNG_Parametarisation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class_One {

	@Parameters({"myUrl","myUsername","myPassword"}) // case sencitve should be exact as in xml given
	@Test
	public void classOneTest1(String url1, String userName, String password)
	{
		String url= url1;
	/*	String userName= "sriprasad";
		String password= "Dhruvanth@9";*/
		System.out.println("url ="+url);
		System.out.println("userName ="+userName);
		System.out.println("password ="+password);

		System.out.println("classOneTest1");
	}


	@Test
	public void classOneTest2( )
	{

		System.out.println("classOneTest2");
	}

	@Test
	public void classOneTest3()
	{
		System.out.println("classOneTest3");
	}

}
