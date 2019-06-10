public class Bank {
	private int account_number
	private int account_balance = 0;

	// getter method
	public int getBalance(){
		return this.account_balance;
	}
	// setter method
	public void setNumber(int num){
		this.account_balance = num;
	}

	public void main(String[] args) {
	}

	public static void Deposit(int depositAmount){
		account_balance = account_balance + depositAmount;
	}

	public static void Withdraw(int withdrawAmount){
		account_balance = account_balance - withdrawAmount;
	}

	public static void viewBalance(){
		System.out.println("Available Balance: " + account_balance);
	}
}