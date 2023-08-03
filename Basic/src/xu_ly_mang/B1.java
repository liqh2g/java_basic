package xu_ly_mang;

import java.util.Scanner;

public class B1 {
	public static int input() {
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		int n = 0;
		while (!check) {
			System.out.print(" ");
			try {
				n = sc.nextInt();
				check = true;
			} catch (Exception e) {
				System.out.println("Ban phai nhap so! hay nhap lai...");
				sc.nextLine();
			}
		}
		return n;
	}

	public static int countElement(int a[], int n, int i) {
		int cnt = 0;
		for (int j = 0; j < n; j++) {
			if (a[j] == i)
				cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		 int n,i;
		 System.out.println("Nhap n= ");
		 n= input();
		 int[] a= new int[n];
		 for(i=0 ; i<n ; i++)
		 {
			 System.out.println("Nhap phan tu thu " +(i+1)+" ");
			 a[i]= input();
		 }
		 System.out.print("Cac phan tu trong day xuat hien 1 lan: ");
		 for(i=0 ; i<n ; i++)
		 {
			 if(countElement(a, n, a[i])==1)
				 	System.out.print(" "+a[i]);
		 }
	}
}
