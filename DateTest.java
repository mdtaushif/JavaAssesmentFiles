public class DateTest {
	public static void DisplayDate(Date dateTemp) {
		System.out.println(dateTemp.Month +"/"+ dateTemp.Day+"/"+dateTemp.Year);
	}
	public static void main(String[] args) {
		Date date1 =new Date(03,14,2022);
		Date date2 =new Date(04,14,2022);
		Date date3 =new Date(05,14,2022);
		DisplayDate(date1);
		DisplayDate(date2);
		DisplayDate(date3);
	}
}
