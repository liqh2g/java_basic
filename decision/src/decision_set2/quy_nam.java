package decision_set2;

import java.util.Scanner;

public class quy_nam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		Scanner sc = new Scanner(System.in);
			m = sc.nextInt();
				switch (m) {
				case 1:
				case 2:
				case 3:
					System.out.println("Thang "+m+" thuoc quy I");
					break;
				case 4:
				case 5:
				case 6:
					System.out.println("Thang "+m+" thuoc quy II");
					break;
				case 7:
				case 8:
				case 9:
					System.out.println("Thang "+m+" thuoc quy III");
					break;
				case 10:
				case 11:
				case 12:
					System.out.println("Thang "+m+" thuoc quy IV");
					break;
				default:
					System.out.println("Trong nam khong co thang "+m);
					break;
				}

	}

}
