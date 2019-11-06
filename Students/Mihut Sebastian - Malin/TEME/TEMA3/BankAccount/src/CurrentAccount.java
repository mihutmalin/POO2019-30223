
public class CurrentAccount extends Account{
	double overdraftLimit;

	public CurrentAccount(int number,double overdraftLimit) {
		super(number);
		this.overdraftLimit=overdraftLimit;
	}
	
	public String toString() {
		return "CurrentAccount " + this.getAccountNumber() + ": " + "balance = " + this.getBalance();
	}
	
}
