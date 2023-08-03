package set3_loop;

import java.util.Scanner;

public class ve_hinh_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t, r, c, h, w, i, j, z;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(i = 0; i < t; ++i)
		{
			r = sc.nextInt(); c = sc.nextInt();
			h = sc.nextInt(); w = sc.nextInt();
			for(j = 0; j <= (h+1)*r; ++j)
			{
				if(j % (h+1) == 0)
				{
					for(z = 0; z <= (w+1)*c; ++z)
					{
						System.out.print("*");
					}
				}
				else
				{
					for(z = 0; z <= (w+1)*c; ++z)
					{
						if(z % (w+1) == 0)
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
