package decision_set2;

import java.util.Scanner;

public class cung_dau {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a , b;
			a = s.nextDouble();
			b = s.nextDouble();
		if(a * b < 0)
		{
			System.out.println("Trai dau");
		}else if (a * b != 0)
		{
			System.out.println("Cung dau");
		}else
		{
			System.out.println("Nhap a> 0, b >0");
		}

	}

}
