
public class Test {
	
	public static void main(String[] args) throws MyException{
		MyException e=new MyException("POO");
		System.out.println(e.getCuvant());
		System.out.println(e.getMessage());
	}

}
