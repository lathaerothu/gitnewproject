package Basics;

import java.util.Scanner;

public class Simplelogicprogram {
	public static void main(String args[]) {
		int num, sum = 0, output;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		num = sc.nextInt();
		sum = (num + num) / 2;
		output = (sum + num) / 2;
		System.out.println("The final output is :" + output);

	}
}
