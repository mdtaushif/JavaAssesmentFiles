import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		int a,b,c,sum,avg,prod;
		Scanner num = new Scanner(System.in);
		System.out.print("num1:  ");
		a=num.nextInt();
		System.out.print("num2:  ");
		b=num.nextInt();
		System.out.print("num3:  ");
		c=num.nextInt();
		sum=a+b+c;
		avg=c/3;
		prod=a*b*c;
		System.out.println("sum:  " + sum);
		System.out.println("avrage:  "+ avg);
		System.out.println("prod: "+ prod);
		
		if(a>b && a>c) {
			System.out.println(a+" is greatest");
		}else if(b>a && b>c) {
			System.out.println(b+" is greatest");
		}else {
			System.out.println(c+" is greatest");
		}
		if(a<b && a<c) {
			System.out.println(a+" is smallest");
		}else if(b<a && b<c) {
			System.out.println(b+" is smallest");
		}else {
			System.out.println(c+" is smallest");
		}
	}

}
