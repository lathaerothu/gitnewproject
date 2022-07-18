package Basics;

import java.util.Scanner;

public class Task25 {
	public static void main(String args[])
	{
		int num1,num2;
		Scanner p=new Scanner(System.in);
		System.out.println("enter the numbers");
		num1=p.nextInt();
		num2=p.nextInt();
		int quosent =num1/num2;
		int reminder=num1%num2;
		System.out.println("the division of two numbers  quosent is:"+quosent);
		System.out.println("the division of two numbers  reminder is:"+reminder);
	}		

}
