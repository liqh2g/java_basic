import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		phep toan tren so nguyen 1
//		Scanner s = new Scanner (System.in);
//		int a = s.nextInt();
//		int b = s.nextInt();
//		System.out.println(a+b);
//		System.out.print(a-b);
		
//		phep toan tren so nguyen 2
//		Scanner s = new Scanner(System.in);
//		int a = s.nextInt();
//		int b = s.nextInt();
//		System.out.printf("%d + %d = %d\n",a,b,a+b);
//		System.out.printf("%d - %d = %d\n",a,b,a-b);
//		System.out.printf("%d x %d = %d\n",a,b,a*b);
//		System.out.printf("%d / %d = %d\n",a,b,a/b);
//		System.out.printf("%d %% %d = %d",a,b,a%b);
		
//		phep toan tren so nguyen 3:
		Scanner s = new Scanner (System.in);
		int a,b;
		a = s.nextInt();
		b = s.nextInt();
		double c = (double) a /(double) b;
		int d1,d2;
		d2 = s.nextInt();
		d1 = s.nextInt();
		System.out.printf("%d : %d = "+"%"+d2+"."+d1+"f\n",a,b,c);
	}

}
