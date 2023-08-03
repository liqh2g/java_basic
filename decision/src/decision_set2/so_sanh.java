package decision_set2;

import java.util.Scanner;

public class so_sanh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
			double a, b;
				a = s.nextDouble();
				b = s.nextDouble();
					if (a > b)
					{
						System.out.println("a > b");
					}
					else if (a == b)
					{
						System.out.println("a = b");
					}
					else
					{
						System.out.println("a < b");
					}

	}

}
