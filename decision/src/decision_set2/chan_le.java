package decision_set2;

import java.util.Scanner;

public class chan_le {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if (a % 2 == 0) 
		{
			System.out.println(a+" la so chan.");
		} else 
		{
			System.out.println(a+ " la so le.");
		}
	}

}
