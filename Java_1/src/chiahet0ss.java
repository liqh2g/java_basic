import java.util.Scanner;

public class chiahet0ss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, x;
		Scanner s = new Scanner(System.in);
			a = s.nextInt();
			b = s.nextInt();
			x = ((a % b) - 1) >>> 31;
				System.out.println(x);
	}
}
