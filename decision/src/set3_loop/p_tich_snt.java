package set3_loop;

import java.util.Scanner;

public class p_tich_snt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, x, t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(j = 0; j < t; ++j)
		{
			x = sc.nextInt();
			i = 2;
			if( x == 1)
			{
				System.out.println("1 = 1 ");
			}
			else
			{
				System.out.printf("%d =", x);
				while(x > 1)
				{
					if(x % i == 0)
					{
						System.out.printf(" %d ", i);
						if(x != i)
						{
							System.out.printf("x");
						}
						x /= i;
					}
					else
					{
						++i;
					}
				}
			}
		}
	}
}
