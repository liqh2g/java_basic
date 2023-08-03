import java.util.Scanner;

public class giatribit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,number;
		Scanner s = new Scanner(System.in);
		
		number = s.nextInt();
		n = s.nextInt();
		
		number = number << (32-n-1);
		number = number >>> 31;
		
		System.out.println(Integer.toBinaryString(number));
	}

}
