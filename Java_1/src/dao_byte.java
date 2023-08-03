import java.util.Scanner;

public class dao_byte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long a, x, y, z;
		Scanner s = new Scanner(System.in);
			a = s.nextLong(16);
			System.out.printf("0x%08x ~ %10d\n", a, a);
			x = (a >>> 24) ^ ((a << 56) >>> 32); // E5 00 00 01
			y = (((a >>> 24) << 24) ^ (((a << 56) >>> 32) >>> 24)); // 01 00 00 E5
			// 01 2F 39 E5 + 01 00 00 E5 = 00 2F 39 00
			z = ((((a ^ y) << 48) >>> 32) ^ (a ^ y)) >>> 16;
			a = x ^ (z << 8) ;
			System.out.printf("0x%08x ~ %10d", a, a);
			
			
	}

}
