import java.util.Scanner;

public class bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			char c = sc.next().charAt(0);
			int k = sc.nextInt();
//	ma hoa ky tu
//			int d = (c+k)%26 + 52;
//			System.out.printf("%c",d);
//	giai ma ky tu
			int d = (c-k)%26 + 52;
			System.out.printf("%c",d);
	}

}
