package Basics;

public class Convertinginttostring {

	void convertingint() {
		int i = 90;
		String s = String.valueOf(i);
		System.out.println(s);
	}

	void converting() {
		int i = 90;
		String s = Integer.toString(i);
		System.out.println(s);
	}

	public static void main(String args[]) {
		Convertinginttostring convert = new Convertinginttostring();
		convert.convertingint();
		convert.converting();
	}
}
