package decision_set2;

import java.util.Scanner;

public class cuoc_Taxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double s =sc.nextDouble();
		int m = 10;
			if(s <=0.8)
			{
				m = 10;
			}
			else if(s <= 30)
			{
				m = (int)(m + 11*(s-0.8));
			}
			else
			{
				m = (int)(m + 11*(s-0.8));
				m = (int)(m + 11*(s-0.8-30));
			}
			m *= 1000;
			System.out.println(m);
			
	}

}
