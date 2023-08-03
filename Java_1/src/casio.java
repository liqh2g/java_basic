import java.util.Scanner;		
public class casio {

	public static void main(String[] args) {
				int r=0;
				
				Scanner s = new Scanner(System.in);
				int a = s.nextInt();
				String c = s.next();
				int b = s.nextInt();
			switch(c) 
			{
				case"+":
					r=a+b;
					break;
				case"-":
					r=a+b;
					break;
				case"x":
					r=a*b;
					break;
				case":":
					r=a/b;
					break;
				default:
					break;
			}
			System.out.println(r);
			}

		}
