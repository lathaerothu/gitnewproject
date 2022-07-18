package Basics;

import java.util.Scanner;

public class Task23 {
	public static void main(String args[])
	{
		float num1,num2;
		Scanner p=new Scanner(System.in);
		System.out.println("enter the numbers");
		num1=p.nextFloat();
		num2=p.nextFloat();
		float mul =num1*num2;
		System.out.println("the muliplication of two numbers is:"+mul);

}
}