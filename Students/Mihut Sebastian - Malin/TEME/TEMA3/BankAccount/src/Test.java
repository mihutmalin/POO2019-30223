
public class Test {
	public static void main(String[] args) {
		Bank b=new Bank();
		
		b.createCurrentAccount(2134354,100);
		b.arr[0].deposit(10);
		b.arr[0].withdraw(100);
		
		b.createSavingsAccount(894436,0.09);
		b.arr[1].deposit(100);
		b.arr[1].withdraw(20);
		
		b.createSavingsAccount(413,0.1);
		b.arr[2].deposit(100);
		b.deleteAccount(413);
		
		b.createSavingsAccount(410,0.0132);
		b.arr[3].deposit(543);
		
		b.update();
		
		for(int i=0;i<b.arr.length;i++) {
			if(b.arr[i]!=null) {
				b.arr[i].print();
			}
		}
	}

}
