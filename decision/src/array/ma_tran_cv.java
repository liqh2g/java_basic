package array;

import java.util.Scanner;

public class ma_tran_cv {
	static Scanner sc = new Scanner(System.in);

	static void input(int n, int m, int a[][]) {
		int i, j;
		for (i = 0; i < n; ++i) {
			for (j = 0; j < m; ++j) {
				a[i][j] = sc.nextInt();
			}
		}
	}

	static void check(int a[][], int b[][], int n, int m) {
		int i, j;
		for (i = 0; i < m; ++i) {
			for (j = 0; j < n; ++j) {
				b[i][j] = a[j][i];
			}
		}
	}

	static void output(int m, int n, int a[][]) {
		int i, j;
		for (i = 0; i < m; i++) {
			System.out.printf("\n");
			for (j = 0; j < n; ++j) {
				System.out.printf("%d ", a[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		int n, m;
		int a[][], b[][];
		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[n][m];
		b = new int[m][n];
		input(n, m, a);
		check(a, b, n, m);
		output(m, n, b);
	}
}
