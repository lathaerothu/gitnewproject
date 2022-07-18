package Basics;

public class Task6 {
	 int add()
	{
	int a=10;
	int b=20;
	int c=30;
	int sum=a+b+c;

	return sum;
	
}
	 int avg()
		{
		int a=10;
		int b=20;
		int c=30;
		
		int avg =(a+b+c)/3;
		return avg;
		}
	public static void main (String args[]) {
	Task6 e=new Task6();
	System.out.println (e.add());
    System.out.println (e.avg());
	}
}

