package Basics;

public class Convertstringtoint {

	void converting() {
		String str = "22";
		int s = Integer.valueOf(str);
		System.out.println(s);
	}

	void stringconvert() {
		String str = "100";
		int i = Integer.parseInt(str);
		System.out.println(i);
	}

	void stringtointexample() {
		String str = "200";
		int i = Integer.parseInt(str);
		System.out.println(i);
		System.out.println(i + str);
		System.out.println(str + i);
	}

	void converstringtoint() {
		String str = "22";
		String s = String.valueOf(str);
		System.out.println(s + str);
		System.out.println(str + s);

	}

	public static void main(String args[]) {
		Convertstringtoint convert = new Convertstringtoint();
		convert.converting();
		convert.stringconvert();
		convert.stringtointexample();
		convert.converstringtoint();
	}
}
