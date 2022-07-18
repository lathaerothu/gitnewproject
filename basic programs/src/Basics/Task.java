
package Basics;
import java.util.*;
public class Task {
	
	public static void main(String a[])
	{
	Scanner scan=new Scanner(System.in);
	int number;
	System.out.println("Enter a number:");
	number=scan.nextInt();
	if (number > 0) 
	
	System.out.println(number+" is Positive Number"); 
	//display the Positive Number
	else 
	System.out.println(number+ " is Negative Number"); //display Negative Number
	
	}
}

