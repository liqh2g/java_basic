package set3_loop;

import java.util.Scanner;

public class so_chinh_phuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t, x, i, x2, sqrt_x;
		Scanner s = new Scanner(System.in);
		t = s.nextInt();
		for(i = 0; i < t; ++i)
		{
			x = s.nextInt();
			sqrt_x = (int) Math.sqrt(x);
			x2 = sqrt_x * sqrt_x;
			if(x2 == x)
			{
				System.out.printf("%5d : YES", x);
			}
			else
			{
				System.out.printf("%5d : NO", x);
			}
		}
	}

}
