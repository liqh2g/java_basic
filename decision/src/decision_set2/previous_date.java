package decision_set2;

import java.util.Scanner;

public class previous_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pre_date date = new pre_date();
		date.input();
		date.preDate();
		date.outPut();
	}
}
class pre_date
{
	public int d;
	public int m;
	public int y;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap ngay hop le.");
			d = sc.nextInt(); m = sc.nextInt(); y = sc.nextInt();
		} while (!valid());		
		System.out.printf("Ngay hien tai: %d/%d/%d.\n", d, m, y);
	}
	public int max_Date() {
		int maxDate[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(y % 100 != 0 & y % 4 == 0 || y % 400 == 0)
		{
			maxDate[2] = 29;
		}
		return maxDate[m];
	}
	public void preDate() {
		if(d>1){
			d--;
		}
		else if (m > 1) {
			d = max_Date();
			m--;
		}
		else {
			d = 31; m = 12;
			y--;
		}
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
	public void outPut() {
		System.out.printf("Ngay lien truoc: %d/%d/%d.", d, m, y);
	}
}
