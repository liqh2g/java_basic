package String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class B3 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 1 xau: ");
		String str= sc.nextLine();
		StringTokenizer strToken= new StringTokenizer(str, " ");
		System.out.println("So cac tu trong xau la: "+strToken.countTokens());
		 }

}
