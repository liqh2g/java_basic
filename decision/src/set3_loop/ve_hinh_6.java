package set3_loop;

import java.util.Scanner;

public class ve_hinh_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t, r, c, i, j, k, tmp;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(i = 1; i <= t; i++)
		{
			r = sc.nextInt();
			c = sc.nextInt();
			for(j = 1; j <= r; ++j)
			{
				for(k = 1; k <= c; ++k)
				{
					tmp = Math.abs(k-j);
					if(tmp % 2 == 0 )
					{
						System.out.printf("*");
					}
					else
					{
						System.out.printf(".");
					}
				}
				System.out.printf("\n");
			}
		}
	}

}
