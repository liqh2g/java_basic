import java.util.Scanner;

public class thiet_lap_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int x, n, b;
			x = s.nextInt();
			n = s.nextInt();
			b = s.nextInt();
			System.out.printf("%08x\n",x);
			x = x ^ ((1 << n)^(b << n));
			System.out.printf("%08x",x);
	}

}
