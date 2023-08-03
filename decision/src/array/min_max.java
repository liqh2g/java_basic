package array;

import java.util.Scanner;

public class min_max {
	static Scanner sc = new Scanner(System.in);

	static void input_arr(int n, float a[]) {
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextFloat();
		}
	}

	static void check_min(int n, float a[]) {
		float min = a[0];
		for (int i = 1; i < n; ++i) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.printf("Min = %.3f\n", min);
	}

	static void check_max(int n, float a[]) {
		float max = a[0];
		for (int i = 1; i < n; ++i) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.printf("Max = %.3f", max);
	}

	public static void main(String[] args) {
		int n;
		n = sc.nextInt();
		float[] a;
		a = new float[n];
		input_arr(n, a);
		check_min(n, a);
		check_max(n, a);
	}
}
