package set3_loop;

import java.util.Scanner;

public class tinh_tong_1n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		double sum = 1;
		for(i = 2; i <= n; i++)
		{
			sum += (double)1/i;
		}
		System.out.printf("%.10f", sum);
	}

}
