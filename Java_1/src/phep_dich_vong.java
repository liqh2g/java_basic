import java.util.Scanner;

public class phep_dich_vong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long x, y, z;
		int n;
			x = s.nextLong();
			n = s.nextInt();
			y = x;
				x = ((x << (64 - n)) >>> 32) ^ (x >>> n);
				System.out.printf("x >> 4 = %d = 0x%08x\n", x, x);
				y = (y >>> (32 - n)) ^ ((y << (32 + n)) >>> 32) ;
				System.out.printf("x << 4 = %d = 0x%08x", y, y);
	}

}
