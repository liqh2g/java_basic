package array;

import java.util.Scanner;

public class reversing_arr {
	// TODO Auto-generated method stub
	static int n;
	static int[] a;

	static void input() {
		Scanner sc = new Scanner(System.in);
		int i;
		n = sc.nextInt();
		a = new int[n];
		for (i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
		}
	}

	static void output() {
		Scanner sc = new Scanner(System.in);
		for (int i : a) {
			System.out.printf("%5d ", i);
		}
	}

	static void reverseArr() {
		int i, x, y;
		x = 0;
		y = n - 1;
		while (x < y) {
			int tmp = a[x];
			a[x] = a[y];
			a[y] = tmp;
			x++;
			y--;
		}
	}

	public static void main(String[] args) {
		input();
		output();
		System.out.printf("\n");
		reverseArr();
		output();
	}

}
