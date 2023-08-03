import java.util.Scanner;

public class ktrachanle0ss {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
			a = s.nextInt();
			System.out.println((~a << 31) >>> 31);	// chan: 1, le: 0
	}
}
