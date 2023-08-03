package array;

import java.util.Scanner;

public class select_element {
	static void input(float a[], int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextFloat();
		}
	}

	static void findNum(float a[], int n) {
		float avg = 0, sum = 0;
		int i;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < n; i++) {
			sum += a[i];
		}
		avg = sum / n;
		System.out.printf("Avg = %.3f\n", avg);
		for (i = 0; i < n; ++i) {
			if (avg < a[i]) {
				System.out.printf("%.2f ", a[i]);
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		float[] a = new float[n];
		input(a, n);
		findNum(a, n);
	}
}
