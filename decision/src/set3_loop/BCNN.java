package set3_loop;

import java.util.Scanner;

public class BCNN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, r, a1, b1, lcm, t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(int i = 0; i < t; ++i)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			a1 = a;
			b1 = b;
			while(b != 0)
			{
				r = a % b;
				a = b;
				b = r;
			}
			lcm = (a1 / a) * b1;
			System.out.printf("LCM(%5d,%5d) = %5d", a1, b1, lcm);
		}
		sc.close();
	}

}
