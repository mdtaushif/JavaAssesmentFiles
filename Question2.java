import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner number_input=new Scanner(System.in);
		System.out.print("num1 ");
		a= number_input.nextInt();
		System.out.print("num2 ");
		b=number_input.nextInt();
		System.out.print("num3 ");
		c= number_input.nextInt();
		d=a*b*c;
		System.out.print("product:-" + d); 

	}

}
