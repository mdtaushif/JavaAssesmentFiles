import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		int counter, number, largest=0;
		Scanner num = new Scanner(System.in);
		counter = 1;
		for (counter = 1; counter <= 10; counter++) {
			System.out.print("sales entry");
			System.out.print(" "+counter+" :  ");
			number = num.nextInt();
			if(number>largest) {
				largest=number;
			}
		}
		System.out.println("highest preformance is: "+ largest);
	}

}
