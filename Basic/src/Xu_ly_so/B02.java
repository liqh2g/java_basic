package Xu_ly_so;

import java.util.Scanner;

public class B02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		if(n > 0)
			System.out.println(giai_thua(n));
	}
	static int giai_thua(int n)
	{
		if(n == 0)
			return 1;
		else
			return n = n*(giai_thua(n-1));
	}
}
