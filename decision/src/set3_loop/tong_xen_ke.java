package set3_loop;

import java.util.Scanner;

public class tong_xen_ke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i;
		double s1, s2, sum;
		s1 = 0; s2 = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i = 2; i <= n; i += 2)
		{
			s1 -= (double)1/i;
		}
		for(i= 1; i<= n; i += 2)
		{
			s2 += (double)1/i;
		}
		sum = s1 + s2;
		System.out.printf("%.13f", sum);
	}

}
