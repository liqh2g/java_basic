package array;

import java.util.Scanner;

public class tich_ma_tran {
	static Scanner sc = new Scanner(System.in);

	static void input(int x, int y, int a[][]) {
		int i, j;
		for (i = 0; i < x; ++i) {
			for (j = 0; j < y; ++j) {
				a[i][j] = sc.nextInt();
			}
		}
	}

	static void output(int x, int y, int a[][]) {
		int i, j;
		for (i = 0; i < x; ++i) {
			System.out.printf("\n");
			for (j = 0; j < y; ++j) {
				System.out.printf("%d ", a[i][j]);
			}
		}
	}

	static void check(int m, int n, int p, int a[][], int b[][], int c[][]) {
		int i, j, k;
		c[0][0] = 0;
		for (i = 0; i < m; ++i) {
			for (j = 0; j < p; ++j) {
				for (k = 0; k < n; ++k) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}

	}

	public static void main(String[] args) {
		int m, n, p;
		m = sc.nextInt();
		n = sc.nextInt();
		p = sc.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int[n][p];
		int c[][] = new int[m][p];
		input(m, n, a);
		input(n, p, b);
		check(m, n, p, a, b, c);
		output(m, p, c);
	}
}
