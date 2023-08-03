package array;

import java.util.Scanner;

public class dotProduct {

	static void in_put(int a[], int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
		}
	}

	static void dot_product(int a[], int b[], int n) {
		int sum = 0;
		int i = 0;
		while (i < n) {
			sum += a[i] * b[i];
			i++;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		in_put(a, n);
		in_put(b, n);
		dot_product(a, b, n);
	}

}
