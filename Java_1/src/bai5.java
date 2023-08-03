import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
//		System.out.printf("a   = "+"%"+10+"."+3+"f\n",a);
//		System.out.printf("b   = "+"%"+10+"."+3+"f\n",b);
//		System.out.printf("a+b = "+"%"+10+"."+3+"f",a+b);
		
		int d1 = s.nextInt();
		int d2 = s.nextInt();
		
		System.out.printf("( %" + d1 + "." + d2 + "f)" + " + " + "( %" + d1 + "." + d2 + "f)"+" = "+" %" + d1 + "." + d2 + "f\n",a,b,a+b);
		System.out.printf("( %" + d1 + "." + d2 + "f)" + " + " + "( %" + d1 + "." + d2 + "f)"+" = "+" %" + d1 + "." + d2 + "f\n",a,b,a-b);
		System.out.printf("( %" + d1 + "." + d2 + "f)" + " + " + "( %" + d1 + "." + d2 + "f)"+" = "+" %" + d1 + "." + d2 + "f\n",a,b,a*b);
		System.out.printf("( %" + d1 + "." + d2 + "f)" + " + " + "( %" + d1 + "." + d2 + "f)"+" = "+" %" + d1 + "." + d2 + "f\n",a,b,a/b);
	}

}
 