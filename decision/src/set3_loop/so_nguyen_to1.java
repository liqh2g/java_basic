package set3_loop;

import java.util.Scanner;

public class so_nguyen_to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t, x, i, j;
		Scanner s = new Scanner(System.in);
		t = s.nextInt();
		for(i = 0; i < t; ++i)
		{
			x  = s.nextInt();
			if(!check_snt(x))
			{
				System.out.printf("%5d : NO", x);
			}
			else
			{
				System.out.printf("%5d : YES", x);
			}
		}
		s.close();
	}
	
	public static boolean check_snt(int x)
	{
		int sqrt = (int) Math.sqrt(x);
		if(x < 2)
		{
			return false;
		}
		else
		{
			for(int j = 2; j <= sqrt; ++j)
			{
				if(x % j == 0)
				{
					return false;
				}
			}
		}
		return true;
	}

}
