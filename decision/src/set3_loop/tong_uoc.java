package set3_loop;

import java.util.Scanner;

public class tong_uoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t, x, i, j, sum;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(j = 0; j < t; ++j)
		{
			x = sc.nextInt();
			sum = 0;
			for(i = 1 ; i < x; ++i)
			{
				if(x % i == 0)
				{
					sum += i;
				}
			}
			System.out.println(sum);
		}
	}

}
