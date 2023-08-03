package set3_loop;

import java.util.Scanner;

public class tong_hieu_xen_ke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n, i, a, b;
		double s1, s2, sum;
		s1 = 1; s2 = 0;
		a = 1; b = 1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
	
		for(i = 2; i <= n; ++i)
		{
			a *= i;
			if(i % 2 == 0)
			{
				s1 -= (double)1/a;
			}
			else
			{
				s2 += (double)1/a;
			}
		}
		sum = s1 + s2;
		System.out.printf("%.13f", sum);
	}

}
