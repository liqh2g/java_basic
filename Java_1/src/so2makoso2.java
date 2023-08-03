import java.util.Scanner;

public class so2makoso2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
			a = s.nextInt();
			b = s.nextInt();
		System.out.println((b-a) >>> 31); // a>b: 1, a<b: 0
	}

}
