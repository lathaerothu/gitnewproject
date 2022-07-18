package Basics;

public class Task5 {
	void add() {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("addition of two numbers"+c);
}
	void sub() {
		int a=100;
		int b=90;
		int c=a-b;
		System.out.println("substraction of two numbers"+c);
	}
	void mul() {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("multiplication of two numbers"+c);
	}
	void div() {
		int a=10;
		int b=20;
		int c=a/b;
		System.out.println("divisible of two numbers"+c);
	}

	
	public static void main (String args[]) {
		Task5 e =new Task5();
		e.add();
		e.sub();
		e.mul();
		e.div();
	}
	}


