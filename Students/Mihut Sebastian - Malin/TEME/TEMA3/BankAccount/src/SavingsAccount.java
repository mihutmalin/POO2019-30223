
public class SavingsAccount extends Account{
	private double interest;
	
	public SavingsAccount(int number,double interest) {
		super(number);
		this.interest=interest;
	}
	
	public void addInterest() {
		this.deposit(this.interest*this.getBalance());
	}
	
	public double getInterest() {
		return interest;
	}
	
	public String toString() {
		return "SavingsAccount " + this.getAccountNumber() + ": " + "balance = " + this.getBalance();
	}
	
}
