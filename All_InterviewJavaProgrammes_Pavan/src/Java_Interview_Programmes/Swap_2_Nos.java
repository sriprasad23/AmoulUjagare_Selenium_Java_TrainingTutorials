package Java_Interview_Programmes;

public class Swap_2_Nos {

	public static void main(String[] args) {

		int a=10, b=20;
		
		System.out.println("Before swaping the values of: "+a+ " "+b);
		
		// Logic 1 using 3rd Variable 
		/*int temp=a; //temp = 10
			a=b; // a=20
			b=temp; // b=10*/
		
		// Logic 2 using + and - operators without using 3rd variables
		
		/*a=a+b; //10+20=30
		b=a-b;	 //30-20=10
		a=a-b;*/ //30-10=20
		
		// Logic 3 using * and / operators without using 3rd variables
		
	/*	a=a*b; // 10*20=200
		b=a/b; // 200/20= 10
		a=a/b; // 200/10= 20*/
		
		// Logic 3 using XOR ^ without using 3rd variables
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After swaping the values of: "+a+ " "+b);
	}

}
