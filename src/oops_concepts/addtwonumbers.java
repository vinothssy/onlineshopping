package oops_concepts;

import java.util.Scanner;

public class addtwonumbers {

	public static void main(String[] args) 
	{
		int a, b, sum;
        Scanner scan1 = new Scanner(System.in);
		
        System.out.print("Enter Two Numbers : ");
        a = scan1.nextInt();
        b = scan1.nextInt();
		
        sum = a + b;
		
        System.out.print("Sum of the Entered Two Number is " +sum);
	}

}
