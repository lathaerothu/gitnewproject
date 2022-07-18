package Basics;

public class Trail {
	
		int add() {
		int a=10;
		int b=20;
		return(a+b);
		//System.out.println("addition of two numbers"+c);
	}
		int sub() {
			int a=100;
			int b=90;
			return(a-b);
			//System.out.println("substraction of two numbers"+c);
		}
		int mul() {
			int a=10;
			int b=20;
			return(a*b);
			//System.out.println("multiplication of two numbers"+c);
		}
		int div() {
			int a=10;
			int b=20;
			return(a/b);
			//System.out.println("divisible of two numbers"+c);
		}

		
		public static void main (String args[]) {
			Trail e =new Trail();
			System.out.println(e.add());
			System.out.println(e.sub());
			System.out.println(e.mul());
			System.out.println(e.div());
		}
		}





