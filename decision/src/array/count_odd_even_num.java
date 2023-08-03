package array;

import java.util.Scanner;

public class count_odd_even_num {
	static Scanner sc = new Scanner(System.in);

	static void input_arr(int n, int a[]) {
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
		}
	}

	static int check_num(int n, int a[]) {
		int count = 0;
		for (int i = 0; i < n; ++i) {
			if (a[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int k, t, n;
		k = 0;
		t = sc.nextInt();
		n = sc.nextInt();
		int[] a = new int[n];
		while (k < t) {
			input_arr(n, a);
			int tmp = check_num(n, a);
			if (tmp != 0) {
				System.out.println("Testcase " + k + ": " + tmp + " even element(s), " + (n - tmp) + " odd element(s)");
			} else {
				System.out.printf("Testcase %d is full odd element", k);
			}
			k++;
		}
	}
}
