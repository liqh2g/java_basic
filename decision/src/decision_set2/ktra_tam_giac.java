package decision_set2;

import java.util.Scanner;

public class ktra_tam_giac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble(); b = sc.nextDouble(); c = sc.nextDouble();
		if(a < b + c & b < a + c & c < a + b)
		{
			if(a == b|| a == c || b == c)
			{
				System.out.println("Tam giac can.");
			}
			else if(a == b & b == c)
			{
				System.out.println("Tam giac deu.");
			}
			else if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b)
			{
				System.out.println("Tam giac vuong.");
			}
			else
			{
				System.out.println("Tam giac thuong.");
			}
		}
	}

}
