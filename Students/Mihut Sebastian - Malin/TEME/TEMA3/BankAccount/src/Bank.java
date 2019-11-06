
public class Bank {
	int n=0;
	Account[] arr=new Account[1000];
	
	Bank() {
		this.n=0;
	}
	
	public void createSavingsAccount(int number,double interest){
		this.arr[this.n]=new SavingsAccount(number,interest);
		this.n++;
	}
	
	public void createCurrentAccount(int number,double overdraftLimit){
		this.arr[this.n]=new CurrentAccount(number,overdraftLimit);
		this.n++;
	}
	
	public void deleteAccount(int number){
		int ok=0;
		for(int i=0;i<this.arr.length;i++)
			if(this.arr[i]!=null && this.arr[i].getAccountNumber()==number) {
				this.arr[i]=null;
				ok=1;
			}
		if(ok==0)
			System.out.println("Nu exista contul cu numarul "+number);
		
	}
	
	public void update() {
		for(int i=0;i<this.arr.length;i++) {
			if(this.arr[i]!=null && this.arr[i].getClass().getName()=="CurrentAccount") {
				if(this.arr[i].getBalance()<0 && this.arr[i].getBalance()>-((CurrentAccount)this.arr[i]).overdraftLimit)
						System.out.println("YOU ARE IN OVERDRAFT");
			}
			if(this.arr[i]!=null && this.arr[i].getClass().getName()=="SavingsAccount") {
				((SavingsAccount)this.arr[i]).addInterest();
			}
		}
	}
}