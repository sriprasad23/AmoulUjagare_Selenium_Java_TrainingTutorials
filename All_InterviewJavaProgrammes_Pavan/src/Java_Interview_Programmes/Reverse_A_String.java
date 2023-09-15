package Java_Interview_Programmes;

public class Reverse_A_String {

	public static void main(String[] args) {

		String str = "ABCDE";
		String rev = "";

		/*
		 * int len = str.length();
		 * 
		 * for(int i=len-1; i>=0; i--) 
		 * {
		 *  rev= rev+str.charAt(i); 
		 *  }
		 * System.out.println("Reverse of String: "+rev);
		 */	

		// Using Charrecter Array

		char a[]= str.toCharArray(); 
		int len= a.length;
		System.out.println("Reverse of String: "+str);
		for(int i=len-1; i>=0; i--) 
		{
			rev = rev+a[i]; 
		}
		System.out.println("Reverse of String: "+rev);


		// Using StringBuffer Class

		/*
		 * StringBuffer sb = new StringBuffer(str);
		 * System.out.println("Revers the string:  "+sb.reverse());
		 */
	}

}
