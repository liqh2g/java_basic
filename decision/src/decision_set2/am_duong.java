package decision_set2;

import java.util.Scanner;

public class am_duong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		if ( a < 0) {
			System.out.printf("%.3f la so am", a);
		} else {
			System.out.printf("%.3f la so duong", a);
		}
	}

}
