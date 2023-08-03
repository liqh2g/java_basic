package set3_loop;

import java.util.Scanner;

public class min_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t, k, i, j;
		double num, tmp, max, min;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(i = 0; i < t; ++i)
		{
			k = sc.nextInt();
			num = sc.nextDouble();
			max = num;
			min = num;
			for(j = 1; j < k;)
			{
				num = sc.nextDouble();
				if(num >= max)
				{
					max = num;
				}
				else
				{
					min = num;
				}
				++j;
			}
			System.out.printf("Max = %15.3f;"+"     "+"Min = %15.3f", max, min);
		}
	}

}
