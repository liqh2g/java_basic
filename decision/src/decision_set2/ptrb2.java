package decision_set2;

import java.util.Scanner;

public class ptrb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b , c;
		Scanner sc = new Scanner(System.in);
			a = sc.nextFloat();
			b = sc.nextFloat();
			c = sc.nextFloat();
		float delta = b*b - 4*a*c;
		double x1 = (-b - Math.sqrt(delta))/ (2*a); 
		double x2 = (-b + Math.sqrt(delta))/ (2*a);
		if(delta < 0) { System.out.println("Ptr vo nghiem");}
		else
		{
			if(delta == 0)
			{
				System.out.println("Ptr co nghiem kep:");
				System.out.printf("x1 = x2 = %.5f", -(b/2*a));
			}
			else
			{
				System.out.println("Ptr co 2 nghiem:");
				System.out.printf("x1 = %.5f\n", x1);
				System.out.printf("x2 = %.5f", x2);
			}
		}
	}

}
