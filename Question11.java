import java.util.ArrayList;
public class Question11 {
	public static void main(String[] args) {
		int x;
		ArrayList<Integer> arr = new ArrayList<>(15);
		for (int i=0;i<10;i++) {
			if (i < 10) {
				arr.add(0);
			}
		}
		for(int i: arr) {
			x=arr.get(i);
			x=x+1;
			arr.add(x);
		} System.out.println(arr);
	} 

}
