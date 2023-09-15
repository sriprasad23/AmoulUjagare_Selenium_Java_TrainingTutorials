package Java_Interview_Programmes;

import java.util.Scanner;

public class Reverse_a_No {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		
		/*int rev = 0;
		
		
		 * while(num!=0) { rev= rev*10 + num%10; num=num/10;
		 * 
		 * }
		 */
		
		// Logic 2 using String Buffer
		
		/*
		 * StringBuffer sb = new StringBuffer(String.valueOf(num)); StringBuffer rev
		 * =sb.reverse();
		 */
		
		// Logic 2 using String Buillder
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		
			
		System.out.println("After Revers the no is: "+rev);
	}

}
