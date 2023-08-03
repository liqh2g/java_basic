import java.util.Scanner;

public class bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double b = s.nextDouble();
//		can bac 2:
//		double c = Math.pow(b, 2);
//		double x = Math.sqrt(Math.sqrt(c));
//		System.out.printf("%.4f",x);
		
//		lam tron so
//		long x = Math.round(b);
//		System.out.println(x);
		
//		lam tron so den phan thap phan
//		b*=10;
//		long x = Math.round(b);
//		double c = (double)x/10;
//		System.out.printf("%.2f", c*c);
		
//		phan nguyen cua so thuc
		int y = (int)b;
		System.out.println(y);
	}

}
