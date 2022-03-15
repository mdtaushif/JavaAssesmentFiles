import java.util.Scanner;

public class Question3 {
public static void main(String[] args) {
		float d, f;
		Scanner temp = new Scanner(System.in);
		System.out.print("tempreture deg F");
		f = temp.nextFloat();
		d = ((f - 32) *5)/9 ;
		System.out.print("degree celcius:  " + d);
	}

} 
 