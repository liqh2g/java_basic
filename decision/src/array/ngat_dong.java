package array;

import java.util.Scanner;

public class ngat_dong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n, r, len;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		len = arr.length;
		for(i = 0; i < len; ++i)
		{
			arr[i] = sc.nextInt();
		}
		r = sc.nextInt();
		for(i = 0; i < len;)
		{
			System.out.printf("%6d", arr[i]);
			++i;
			if(i % r == 0)
			{
				System.out.printf("\n");
			}
		}
	}

}
