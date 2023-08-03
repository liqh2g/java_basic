package decision_set2;

import java.util.Scanner;

public class song_xa_dai_chien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1,x2,y1,y2;
		Scanner sc = new Scanner(System.in);
		x1 = sc.nextInt(); y1 = sc.nextInt(); x2 = sc.nextInt(); y2 = sc.nextInt();
		if(x1 == x2 || y1 == y2 )
		{
			System.out.println("2 xe an nhau");
		}
		else
		{
			System.out.println("2 xe khong an nhau");
		}
	}

}
