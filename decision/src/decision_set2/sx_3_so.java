package decision_set2;

import java.util.Scanner;

public class sx_3_so {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b, c, max1, max2, max3;
		Scanner sc = new Scanner(System.in);
			a = sc.nextFloat();
			b = sc.nextFloat();
			c = sc.nextFloat();
			max1 = a;
			max2 = b;
			max3 = c;
				if(b > max1)
				{
					max1 = b;
					max2 = a;
					max3 = c;
				}
				if(c > max1)
				{
					max1 = c;
					max2 = a;
					max3 = b;
				}
				if(max2 > max3)
				{
					System.out.printf("%.2f-->%.2f-->%.2f",max3, max2, max1);
				}
				else
				{
					System.out.printf("%.2f, %.2f, %.2f",max2, max3, max1);
				}
				
			
	}

}
