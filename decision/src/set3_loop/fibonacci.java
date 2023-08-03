package set3_loop;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, t, a, b, c, i, j;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		a = 1;
		b = 1;
		c = 1;
		i = 2;
		for(j = 0; j < t; ++j)
		{
			n = sc.nextInt();
			while(i < n)
			{
				c = b + a;
				a = b;
				b = c;
				++i;
			}
			System.out.println(c);
		}
	}

}
