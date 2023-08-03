package decision_set2;

import java.util.Iterator;
import java.util.Scanner;

public class order_of_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		order_date date = new order_date();
		date.inPut();
		date.oDate();
	}
}
class order_date
{
	public int d;
	public int m;
	public int y;
	
	public void inPut() {
		Scanner sc = new Scanner(System.in);
		d = sc.nextInt(); m = sc.nextInt(); y = sc.nextInt();
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap ngay hop le.");
			d = sc.nextInt(); m = sc.nextInt(); y = sc.nextInt();
		} while (!valid());		
		System.out.printf("Ngay hien tai: %d/%d/%d.\n", d, m, y);
	}
	public boolean valid()
	{
		if(m < 0 || m > 12 || y < 0)
		{
			return false;
		}
		int []dateMax = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(y % 4 == 0 & y % 100 != 0 || y % 400 == 0)
		{
			dateMax[2] = 29;
		}
		if(d < 0 || d > dateMax[m])
		{
			return false;
		}
		return true;
	}
	public void oDate() {
		int x;
		int maxDate[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(y % 100 != 0 & y % 4 == 0 || y % 400 == 0)
		{
			maxDate[2] = 29;
		}
		
		for(x = 2; x <=m; x++)
		{
			d = d + maxDate[x-1];
		}
		System.out.println(d);
	}
}
