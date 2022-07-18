package Basics;

public class Convertinttodouble {
	void convertingint() {
		int i = 90;
		double d = i;
		System.out.println(d);
	}

	void converting() {
		int i = 101;
		double d = Double.valueOf(i);
		System.out.println(d);
	}

	public static void main(String args[]) {
		Convertinttodouble convert = new Convertinttodouble();
		convert.convertingint();
		convert.converting();
	}
}
