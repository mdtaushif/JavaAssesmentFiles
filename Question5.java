import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		int a, b, c, d, e, f;
		Scanner number = new Scanner(System.in);
		System.out.print("num1: ");
		a = number.nextInt();
		System.out.print("num2:  ");
		b = number.nextInt();
		c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;
		System.out.println("sum: "+ c);
		System.out.println("diffrence: "+ d);
		System.out.println("product: "+ e);
		System.out.println("quotient: "+f);
		
	}
}
