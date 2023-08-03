package set3_loop;

import java.util.Scanner;

public class tong_day_thuc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, sum;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		sum = a;
		while(a != 0)
		{
			a = sc.nextDouble();
			sum += a;
		}
		sc.close();
		System.out.printf("%.3f", sum);
	}

}
