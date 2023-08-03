package xu_ly_mang;

import java.util.Scanner;

public class B2 {
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

	public static int countElement(int a[], int n, int x) {
		int cnt = 0;
		for (int j = 0; j < n; j++) {
			if (a[j] == x)
				cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		 int n,i,j;
		 System.out.println("Nhap n= ");
		 n= input();
		 int[] a= new int[n];
		 for(i=0 ; i<n ; i++)
		 {
			 System.out.println("Nhap phan tu thu " +(i+1)+" ");
			 a[i]= input();
		 }
		 
		 for(i=0 ; i<n ; i++)
		 {
			 int flag = 0;
			 for(j = 1; j <= i ; j++)
				 if(a[i] == a[j])
					 flag++;
			 if(flag == 1)
				 System.out.println("Phan tu "+a[i]+ " xuat hien "+countElement(a, n, a[i])+" lan");
		 }
	}
}
