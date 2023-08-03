package set3_loop;

import java.util.Scanner;

public class ve_hinh_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t, m, n, i, j, z;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(i = 0; i < t; ++i)
		{
			m = sc.nextInt();
			n = sc.nextInt();
			for(j=1; j<=m; j++)
			{
				if(j == 1 || j == m)
				{
					for(z=1; z<=n; z++)
					{
						System.out.printf("*");
					}
				}
				else
				{
					System.out.printf("*");
					for(z=1; z<=n-2; z++)
					{
						System.out.printf(" ");
					}
					System.out.printf("*");
				}
				System.out.printf("\n");
			}
		}
	}

}
