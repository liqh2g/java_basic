package decision_set2;

import java.util.Scanner;

public class nam_nhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
			if (x % 4 == 0 || x % 400 == 0 & x % 100 != 0 ) 
			{
				System.out.printf("%d la nam nhuan.", x);
			}
			else
			{
				System.out.printf("%d khong la nam nhuan.", x);
			}
	}

}
