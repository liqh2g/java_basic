package set3_loop;

import java.util.Scanner;

public class tong_1ni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a, i, n;
		double sum = 0;
		n = sc.nextInt();
		a = 1;
		for(i = 1; i <= n ; i++)
		{
			a *= i;
			sum += (double)1/a;
		}
		System.out.printf("%.10f",sum);
	}

}
