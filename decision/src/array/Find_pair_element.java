package array;

import java.util.Scanner;

public class Find_pair_element {
	static void input(int a[], int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
		}
	}

	static void find_pair_num(int a[], int n) {
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if (a[i] < a[j]) {
					System.out.printf("(%2d,%2d) = (%5d,%5d)\n", i, j, a[i], a[j]);
				}
			}
		}
	}

	static void output(int a[], int n) {
		for (int i = 0; i < n; ++i) {
			System.out.printf("%5d ", i);
		}
		System.out.printf("\n");
		for (int i = 0; i < n; ++i) {
			System.out.printf("%5d ", a[i]);
		}
		System.out.printf("\n");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[] a = new int[n];
		input(a, n);
		output(a, n);
		find_pair_num(a, n);
	}
}
