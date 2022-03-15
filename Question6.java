import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		int a, b;
		Scanner number = new Scanner(System.in);
		System.out.print("Num1:  ");
		a = number.nextInt();
		System.out.print("Num2:  ");
		b = number.nextInt();
		if (a > b) {
			System.out.println(a+" greater than "+b);
		}else if(a<b) {
			System.out.println(b+" grater than "+a);
		}else {
			System.out.println("these numbers are equal");
		}
	}

}
