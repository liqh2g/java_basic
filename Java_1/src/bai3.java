import java.math.BigInteger;
import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		convert number to hex:
		Scanner sc = new Scanner(System.in);
//		int a;
//	    	a=sc.nextInt();
//	    System.out.printf("0x%08x",a);
		
//		nhap so nguyen o dang hex:
		Scanner s = new Scanner(System.in);
		BigInteger n = s.nextBigInteger(2);
		System.out.printf("0x%x = %d",n,n);
		
	}

}
