
public class Test {
	private String nume;
	
	public String changeToUpper() {
		String s=this.nume.toUpperCase();
		return s.replace('a', 'z');
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.nume=null;
		
		try {
			t.changeToUpper();
		}
		catch(NullPointerException e) {
			
		}
		
		t.changeToUpper();
	}

}
