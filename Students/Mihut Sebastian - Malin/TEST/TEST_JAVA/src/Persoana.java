
public class Persoana {
	private int id;
	private String nume;
	
	Persoana(int id,String nume){
		this.id=id;
		this.nume=nume;
	}
	
	public String toString() {
		return "Persona: "+this.id+" "+this.nume;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNume() {
		return this.nume;
	}
}
