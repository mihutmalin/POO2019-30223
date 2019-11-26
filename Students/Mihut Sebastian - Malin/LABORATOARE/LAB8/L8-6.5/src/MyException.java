
public class MyException extends Exception {
	private String cuvant;
	
	public MyException(String cuvant) {
		super("Exceptia mea!");
		this.cuvant=cuvant;
	}
	
	public String getCuvant() {
		return this.cuvant;
	}
}
