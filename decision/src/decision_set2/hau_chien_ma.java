package decision_set2;

import java.util.Scanner;

public class hau_chien_ma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1,x2,y1,y2;
		Scanner sc = new Scanner(System.in);
		x1 = sc.nextInt(); y1 = sc.nextInt(); x2 = sc.nextInt(); y2 = sc.nextInt();
		int a = Math.abs(x1-x2);
		int b = Math.abs(y1-y2);
		if(a == 1 & b == 2 || a == 2 & b == 1 )
		{
			System.out.println("Hau khong an duoc ma \nMa an duoc hau ");
		}
		else if(a == b || a == 0 || b == 0)
		{
			System.out.println("Hau an duoc ma \nMa khong an duoc hau ");
		}else
		{
			System.out.println("Hau khong an duoc ma \nMa khong an duoc hau ");
		}
	}

}
