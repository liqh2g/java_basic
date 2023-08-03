package set3_loop;

import java.util.Scanner;

public class ve_hinh_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t, r, c, i, j, z;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(i = 0; i < t; ++i)
		{
			r = sc.nextInt();
			c = sc.nextInt();
			for(j = 1; j <= r; ++j)
			{
				if(j == 1 || j == r)
				{
					for(z = 1; z <= c; ++z)
					{
						System.out.printf("*");
					}
				}
				else if(r != 1 && c ==1)
				{
					for(z = 1; z <= 1; ++z)
					{
						System.out.printf("*");
					}
				}
				else
				{
					System.out.printf("*");
					for(z=1; z<=c-2; ++z)
					{
						System.out.printf(".");
					}
					System.out.printf("*");
				}
				System.out.printf("\n");
			}
		}
	}

}
