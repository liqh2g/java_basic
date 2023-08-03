import java.util.Scanner;

public class ha_co {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int x, n;
			x = s.nextInt();
			n = s.nextInt();
			x = (x & (1 << n))^x ;
		System.out.println(x);
	}

}
  