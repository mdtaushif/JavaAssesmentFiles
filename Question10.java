import java.util.Scanner;

public class Question10 {
	public static void sphereVolume(double r) {
		double volume;
		volume = 1.34 * 3.14 * (r*r*r);
		System.out.println("volume of sphere with radius:- " + volume);
	}

	public static void main(String[] args) {
		double r;
		Scanner radius=new Scanner(System.in);
		System.out.print("enter the radius of sphere");
		r=radius.nextDouble();
		sphereVolume(r);
		
		
	}
}
