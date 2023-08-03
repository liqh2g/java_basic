package decision_set2;

import java.util.Scanner;

public class so_lon_nhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner s = new Scanner(System.in);
			a = s.nextInt();
			b = s.nextInt();
			c = s.nextInt();
			if(a > b)
			{
				if(a > c)
				{
					System.out.printf("max{%d, %d, %d} = %d", a, b, c, a);
				}
				else
				{
					System.out.printf("max{%d, %d, %d} = %d", a, b, c, c);
				}
			}
			else
			{
				if(b > c)
				{
					System.out.printf("max{%d, %d, %d} = %d", a, b, c, b);
				}
				else
				{
					System.out.printf("max{%d, %d, %d} = %d", a, b, c, c);
				}
			}
	}

}
