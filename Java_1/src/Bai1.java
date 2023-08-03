import java.util.Scanner;
import java.math.BigInteger;
public class Bai1 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
//		in so nguyen to 1:
//		int a = s.nextInt();
//		long b = s.nextLong();
//		
//		System.out.println(a);
//		System.out.println(b);
//		in so nguyen to 2:
		int da,db;
		BigInteger a,b;
		a = s.nextBigInteger();
		da = s.nextInt();
		b = s.nextBigInteger();
		db = s.nextInt();
		System.out.printf("a = " +"%"+da+"d\n",a);
		System.out.printf("b = " + "%"+db+"d",b);
	}

}
