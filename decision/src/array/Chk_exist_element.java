package array;

import java.util.Scanner;

public class Chk_exist_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, a, i;
		n = sc.nextInt();
		int[] array = new int[n];
		for(i = 0; i < n ; i++)
		{
			array[i] = sc.nextInt();
		}
		a = sc.nextInt();
		check(array,a);
		if(check(array, a)==1)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
    static int check(int array[], int a)
	{
    	int i;
    	int length = array.length;
    	for(i = 0; i < length ; i++)
		{
			if(a == array[i])
			{
				return 1;
			}
		}
		return 0;
	}
}
