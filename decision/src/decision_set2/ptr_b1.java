package decision_set2;

import java.util.Scanner;

public class ptr_b1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float a, b, e;
		float c, d, f;
			a = sc.nextFloat();
			b = sc.nextFloat();
			e = sc.nextFloat();
			c = sc.nextFloat();
			d = sc.nextFloat();
			f = sc.nextFloat();
		float D, Dx, Dy;
			D = a*d - b*c;
			Dx= e*d - b*f;
			Dy= a*f - c*e;
				if(D == 0)
				{
					if(Dx == Dy && Dx == 0)
					{
						System.out.println("Phuong trinh vo so nghiem.");
					}
					else
					{
						System.out.println("Ptr vo nghiem");
					}
				}
				else
				{
					System.out.println("Ptr co nghiem dn.");
					System.out.printf("x = %.5f\n", Dx/D);
					System.out.printf("y = %.5f", Dy/D);
				}
//		float a, b;
//			a = sc.nextFloat();
//			b = sc.nextFloat();
//				if(a != 0)
//				{
//					System.out.printf("%.5f",-(b/a));
//				}
//				else if(b == 0)
//				{
//					System.out.println("Vo so nghiem");
//				}
//				else
//				{
//					System.out.println("Vo nghiem");
//				}
	}

}
