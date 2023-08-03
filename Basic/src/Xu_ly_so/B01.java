package Xu_ly_so;

import java.util.Scanner;

public class B01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i = 10; i<= 200; ++i)
		{
			if(i % 5 != 0 && i % 7 == 0)
			{
				System.out.printf("%d,",i);
			}
		}
	}

}
