package decision_set2;

import java.util.Scanner;

public class d_m_y_valid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		date d = new date();
		d.inPut();
		d.outPut();
	}
}
class date{
	public int date;
	public int month;
	public int year;
	public void outPut() {
		boolean check;
		if(check = valid()) {
		System.out.println(date +"/"+ month +"/"+ year + " Hop le.");
		}
		else
		{
			System.out.println(date +"/"+ month +"/"+ year + " Khong hop le.");
		}
	}
	public void inPut() {
		Scanner sc = new Scanner(System.in);
		date = sc.nextInt(); month = sc.nextInt(); year = sc.nextInt();
	}
	public boolean valid()
	{
		if(month <0 || month > 12 || year < 0)
		{
			return false;
		}
		int []dateMax = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(year % 4 == 0 & year % 100 != 0 || year % 400 == 0)
		{
			dateMax[2] = 29;
		}
		if(date < 0 || date > dateMax[month])
		{
			return false;
		}
		return true;
	}
	
}

