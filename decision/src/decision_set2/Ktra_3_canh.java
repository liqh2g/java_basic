package decision_set2;

import java.util.Scanner;

public class Ktra_3_canh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble(); b = sc.nextDouble(); c = sc.nextDouble();
		if(a < b + c & b < a + c & c < a + b)
		{
			System.out.printf("%.2f %.2f %.2f co the la 3 canh cua tam giac.", a, b, c);
		}
		else
		{
			System.out.printf("%.2f %.2f %.2f ko the la 3 canh cua tam giac.", a, b, c);
		}
	}

}
