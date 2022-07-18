package Basics;

import java.util.Scanner;

public class Task26 {
	public static void main(String args[])
	{
		int num1,num2,num3;
		Scanner p=new Scanner(System.in);
		System.out.println("enter the numbers");
		num1=p.nextInt();
		num2=p.nextInt();
		System.out.println("before swaping  the numbers:"+num1+","+num2);
		num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("after swaping  the numbers:"+num1+","+num2);
		
		
}
}