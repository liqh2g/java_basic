import java.util.Scanner;

public class phep_dich_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
			long x, n, y;
				x = s.nextLong();
				n = s.nextLong();
				y = x;
					y = (long) (y / Math.pow(2, n));
						System.out.printf("x >> 4 = %d = 0x%08x\n", (int) y, (int) y);
					x = (long) (Math.pow(2, n) * x);
						System.out.printf("x >> 4 = %d = 0x%08x\n", (int) x, (int) x);
	}

}
