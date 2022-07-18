package Basicsarraypograms;

public class Sample {
	public static void main(String args[]) {
		int a[] = { 1, 2, 3, 4, 5 };
		int num = 3;
		int flag = 0;

		{

			for (int i = 0; a[i] < a.length; i++) {
				if (i == num) {
					flag = 1;
					break;
				}
			}

			if (flag == 1)
				System.out.println(num + " is found.");
			else
				System.out.println(num + " is not found.");
		}
	}

}
