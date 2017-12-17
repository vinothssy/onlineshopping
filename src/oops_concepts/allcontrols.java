package oops_concepts;

import java.util.Scanner;

public class allcontrols {

	public static void main(String[] args) 
	{

		int a,b,sum,sub,mul,division;
		//int i,count = 0;
		boolean result;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a two  number:");
		do {
			
			a=scan.nextInt();
			b=scan.nextInt();
			sum=a+b;
			sub=a-b;
			mul=a*b;
			division=a/b;
			
			System.out.println("Add the two number of Adding :" + sum);
			
			
			/*for (i = 2; i < sum; i++) 
			{*/
				if (sum%2!=0  && sum%1==0 && sum>=2) 
				{
					System.out.println("This is a prime Number");
				
				}
		
			else {
				System.out.println("This is a Not prime Number");
			}
			
			
			
			
			System.out.println("Add the two number of Subtraction :" + sub);
			System.out.println("Add the two number of Multiplicaiton :" + mul);
			System.out.println("Add the two number of Division :" + division);
			
			if (division%2==0) 
			{
			System.out.println("This number is Even number :" + division);	
			}
			else
			{
				System.out.println("This number is odd number :" + division);
			}
			
			
			
			
		     result=scan.hasNextInt();
			}while (result);
			
		

	}

}
