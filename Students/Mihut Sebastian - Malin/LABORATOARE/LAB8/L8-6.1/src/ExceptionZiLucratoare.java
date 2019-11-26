
public class ExceptionZiLucratoare extends Exception {
	public ExceptionZiLucratoare() {
		super("Ziua introdusa nu este o zi lucratoare");
	}
	public ExceptionZiLucratoare(String mesaj) {
		super(mesaj);
	}
}
