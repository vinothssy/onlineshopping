package oops_concepts;

import java.util.Scanner;

public class largesttwonumber {

	public static void main(String[] args) 
	{
		int a, b, big;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Two Number : ");
        a = scan.nextInt();
        b = scan.nextInt();
		
        if(a>b)
        {
            big = a;
        }
        else
        {
            big = b;
        }
		
        System.out.print("Largest of Two Number is " +big);

	}

}
