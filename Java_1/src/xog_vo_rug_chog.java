import java.util.Scanner;

public class xog_vo_rug_chog {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, n, x;
			x = ~0;
			b = s.nextInt();
			n = s.nextInt();
			a = (1 << n)^( b<<n );
			x = x ^ a;
		System.out.printf("%x",x);	 

	}

}
