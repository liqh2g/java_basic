package set3_loop;

import java.util.Scanner;

public class tong_am_duong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t, n, i, j, s1, s2;
		s1 =0; s2 = 0;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(i = 0; i < t; ++i)
		{
			n = sc.nextInt();
			while(n != 0)
			{
				if(n > 0)
				{
					s1 += n;
					n = sc.nextInt();
				}else
				{
					s2 += n;
					n = sc.nextInt();
				}
			}
			System.out.printf("NegativeSum = %6d;"+"     "+"PositiveSum = %6d", s2, s1);
			s1 = 0; s2 =0;
		}
		
	}

}
