package strings;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String inputString = sc.nextLine();
		char input[]=inputString.toCharArray();
		String outputString = "";
		
        	for(int i=input.length-1;i>=0;i--)
        	{
			outputString += input[i];
			
			
			}
	System.out.println(outputString);
	
		
  sc.close();
	}

}
