package Basics;

import java.util.Scanner;

public class XYZ {
	public static void main(String args[])
	{
		int num;
		double sum=1.0;
		Scanner p =new Scanner(System.in);
		System.out.println("enter the number:");
		num=p.nextInt();
		for( double i=2;i<=num;i++) {
			sum=sum+(1/i);
		
		}
		System.out.println(sum);
	}

}
	