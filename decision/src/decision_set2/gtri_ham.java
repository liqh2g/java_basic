package decision_set2;

import java.util.Scanner;

public class gtri_ham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double f = 2*x*x + 5*x + 9;
		double f1= -f + 9*x;
		if(x >= 5)
		{
			System.out.printf("f(%.3f) = %.3f", x, f);
		}
		else
		{
			System.out.printf("f(%.3f) = %.3f", x, f1);
		}
		

	}

}
