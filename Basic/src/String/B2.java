package String;

import java.util.Scanner;

public class B2 {
	public static void main(String args[]) {
		String reverseStr = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi bạn muốn kiểm tra: ");
		String inputString = sc.nextLine();
		int len = inputString.length();
		for(int i = len - 1; i >= 0; i--)
			reverseStr = reverseStr + inputString.charAt(i);
		if(inputString.equals(reverseStr))
			System.out.println("Đây là chuỗi đối xứng!");
		else
			System.out.println("Đây không phải là chuỗi đối xứng!");
	}
}
