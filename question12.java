import java.util.*;;

public class question12 {
	public static void main(String[] args) {
		int mark;
		System.out.println("to exit loop enter -1 in grade entry");
		Scanner grade = new Scanner(System.in);
		ArrayList<Integer> markArr = new ArrayList<>();
		for (int i = 1; i <= 20; i++) {
			System.out.print("enter the grade:-  ");
			System.out.println("student " + i);
			mark = grade.nextInt();
			markArr.add(mark);
			if (mark == -1) {
				System.out.println("loop exited");
				markArr.remove(new Integer(-1));
				break;
			}
		}
		System.out.println(markArr);
		Average(markArr);
	}

	public static void Average(ArrayList<Integer> getarray) {
		int sum, avg;
		sum = 0;
		for (int i = 0; i <= getarray.size() - 1; i++) {
			sum = sum + getarray.get(i);
		}
		avg = sum / (getarray.size());
		System.out.println("the average grade is:- " + avg);
		System.out.println(getarray.size());

	}
}
