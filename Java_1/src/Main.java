import java.util.Scanner;		
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {8, 8, 7, 9};
        int[] b = {6, 8, 9, 10};

        for(int i = 0; i < a.length; i++){
            for(int j =0; j<b.length; j++){
                if(a[i] == b[j]){
                    System.out.println(a[i]);
                }
            }
        }  
//		Scanner s = new Scanner(System.in);
//
//		System.out.println("what is your name?");
//		String name = s.nextLine();		
//		System.out.println("Hello" + name);
//
//		System.out.println("How old are you?");
//		int age = s.nextInt();
//		System.out.println("You are " + age);
//		
//		s.nextLine();
//		
//		System.out.println("what is your favorite food?");
//		String food = s.nextLine();
//		System.out.println("You like "+ food);
//		double a =5.5;
//		int b = (int)a;
//		double c = (double)b/2;
//		System.out.println(a);
//		System.out.println(c);
//		float randomNum = (float) (Math.random()*101.12);
//		String result = (randomNum > 50) ? "You are winner" : "Wish you luck next time";
//		System.out.println(randomNum);
//		System.out.println(result);
	}

}
