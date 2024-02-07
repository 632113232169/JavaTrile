package Condition_Sta;

import java.util.Scanner;

public class Leap_Year
{

	public static void main(String[] args) 
	{
		 int year;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Any Year :");
		 
		 year = sc.nextInt();
		 
		 if(year % 2 ==0 && year % 100 != 0 || year % 400 == 00)
		 {
			 System.out.println("Year is Leap");
		 }
		 else
		 {
			 System.out.println("Year is NOT Leap");
		 }

	}

}
