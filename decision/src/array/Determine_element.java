package array;

import java.util.Scanner;

public class Determine_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, n, a, tmp;
		n = sc.nextInt();
		int[] arr = new int[n];
		for(i = 0; i < n; ++i)
		{
			arr[i] = sc.nextInt();
		}
		a = sc.nextInt();
		tmp = check_count(arr, a);
		if(tmp != 0)
		{
			System.out.println("The value "+a+" appears "+tmp+" times");
			check_position(arr, a);
		}
		else
		{
			System.out.println("The value "+a+" does not exist in the given array");
		}
	}
	static void check_position(int arr[], int a)
	{
		int i, len;
		len = arr.length;
		System.out.printf("At the following position(s): ");
		for(i = 0; i < len; ++i)
		{
			if(arr[i] == a)
			{
				System.out.printf("%d ", i);
			}
		}
	}
	static int check_count(int arr[], int a)
	{
		int count, i, len;
		len = arr.length;
		count = 0;
		for(i = 0; i < len; ++i)
		{
			if(arr[i] == a)
			{
				count++;
			}
		}
		return count;
	}
}
