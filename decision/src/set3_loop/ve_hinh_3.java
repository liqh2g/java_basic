package set3_loop;

import java.util.Scanner;

public class ve_hinh_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t, n, i, j, z;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for( i = 1; i <= t; ++i)
		{	
			n = sc.nextInt();
			for(j = 1 ; j <= n; ++j)
			{
				if(j == 1 || j == n)
				{
					for(z = 1; z <= n; z++)
					{
						System.out.printf("*");
					}
				}
				else
				{
					System.out.printf("*");
					for(z = 2; z <= n-1; ++z)
					{
						if(z == j)
						{
							System.out.print("*");
						}
						else
						{
							System.out.printf(" ");
						}
					}
					System.out.printf("*");
				}
				System.out.printf("\n");
			}
		}
				
	}

}
