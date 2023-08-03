package set3_loop;

import java.util.Scanner;

public class liet_ke_snt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, x;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();	b = sc.nextInt();
		x = a;
		while(x >= a && x <= b)
		{
			if(check(x))
			{
				System.out.println(x);
			}
			++x;
		}
	}
	public static boolean check(int x)
	{
		int sqrt = (int)Math.sqrt(x);
		if(x < 2)
		{
			return false;
		}
		else
		{
			for(int i = 2; i <= sqrt; ++i)
			{
				if(x % i == 0)
				{
					return false;
				}
			}
		}
		return true;
	}

}
