import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;
		System.out.println("enter the first number:- ");
		a=input.nextInt();
		System.out.println("enter the secont number:- ");
		b=input.nextInt();
		if (a%b==0) {
			System.out.print(a+" is multiple of "+b);
		}else {
			System.out.print(a+" is not a multiple of "+b);
		}
	}
}
