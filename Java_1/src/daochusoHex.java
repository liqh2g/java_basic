import java.util.Scanner;

public class daochusoHex {

	public static void main(String[] args) {
		long a, x, y, z, t, b, c, d ,e;
		Scanner s = new Scanner(System.in);
		a = s.nextLong(16);
		x = a >>> 28;
		y = ((a << 36) >>> 60) << 4;
		z = ((a << 40) >>> 60) << 8;
		t = ((a << 44) >>> 60) << 12;
		b = ((a << 48) >>> 60) << 16;
		c = ((a << 52) >>> 60) << 20;
		d = ((a << 56) >>> 60) << 24;
		e = ((a << 60) >>> 60) << 28;
		System.out.printf("0x%08x", x^y^z^t^b^c^d^e );
	}

}
