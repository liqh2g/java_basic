package decision_set2;

import java.util.Scanner;

public class next_day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ngay date = new ngay();
		date.inPut();
		date.timNgayKeTiep();
	}
}
class ngay{
	public int d;
	public int m;
	public int y;
	public void inPut() {
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
	public int soNgayTrongThang()
	{
		int []ngayMax = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(y % 4 == 0 & y % 100 != 0 || y % 400 == 0)
		{
			ngayMax[2] = 29;
		}
		return ngayMax[m];
	}
	public void timNgayKeTiep() {
		if(d < soNgayTrongThang())
		{
			d++;
		}
		else if(m < 12)
		{
			d =1; m++;
		}
		else
		{
			d = m = 1;
			y++;
		}
		System.out.printf("Ngay ke tiep : %d/%d/%d", d,m,y);
	}
}
