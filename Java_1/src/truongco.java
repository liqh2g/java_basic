import java.util.Scanner;

public class truongco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int x,n;
			x = s.nextInt();
			n = s.nextInt();
			x = x | (1 << n);
		System.out.println(x);
		
	}

}
