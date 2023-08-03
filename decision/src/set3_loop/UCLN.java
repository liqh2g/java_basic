package set3_loop;

import java.util.Scanner;

public class UCLN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, r;
		Scanner sc =  new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		while(b != 0)
		{
			r = a % b;
			a = b;
			b = r;
		}
		System.out.println(a);
	}

}
