import java.util.Scanner;

public class Account_q13 {
	public static void Debit(int withdraw) {
		int Account_Bal=1000;
		if(withdraw<=Account_Bal) {
			Account_Bal=Account_Bal-withdraw;
			System.out.println("Avaliable balance:-  "+Account_Bal);
		}else if (withdraw>Account_Bal) {
			System.out.println("Debit amount exceeded account balance");
		}
		
		
	}
	static public void main(String[] args) {
		int Withdrawal_Amount;
		Scanner amount = new Scanner(System.in);
		System.out.print("Enter the amount to withdraw");
		Withdrawal_Amount=amount.nextInt();
		Debit(Withdrawal_Amount);
		
	}

}
