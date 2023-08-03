package array;

import java.util.Scanner;

public class count_time {

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
	}
    static void check(int array[], int a)
	{
    	int i;
    	int length = array.length;
    	int count = 0;
    	for(i = 0; i < length ; i++)
		{
			if(a == array[i])
			{
				count++;
			}
		}
    	System.out.println(count);
	}
}
