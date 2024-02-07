package Condition_Sta;
import java.util.*;


public class Even_Odd
{

	public static void main(String[] args)
	{
		int n;

		Scanner Sc = new Scanner(System.in);
		 
		 
		System.out.println("Enter A Number");
		
		n = Sc.nextInt();
		 
		if( n % 2 == 0)
		{
			System.out.println("Number Is Even");
			
		}
		else
		{
			System.out.println("Number is Odd");
		
		}
		System.out.println("----End Of Program----");

	}

}
