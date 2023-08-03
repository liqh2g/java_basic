package set3_loop;

import java.util.Scanner;

public class ve_hinh_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t, r, c, i, j, z;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(i = 0; i < t; ++i)
		{
			r = sc.nextInt(); c = sc.nextInt();
			for(j = 0; j <= 3*r; ++j)
			{
				if(j % 3 == 0)
				{
					for(z = 0; z <= 3*c; ++z)
					{
						System.out.print("*");
					}
				}
				else
				{
					for(z = 0; z <= 3*c; ++z)
					{
						if(z % 3 == 0)
						{
							System.out.print("*");
						}
						else
						{
							System.out.printf(".");
						}
					}
				}
				System.out.printf("\n");
			}
		}
	}
}
