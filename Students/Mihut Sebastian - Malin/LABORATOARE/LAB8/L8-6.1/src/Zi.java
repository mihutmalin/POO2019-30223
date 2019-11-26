
public class Zi {
	private String nume;
	Boolean esteLucratoare;
	
	Zi(String nume,Boolean esteLucratoare){
		this.nume=nume;
		this.esteLucratoare=esteLucratoare;
	}
	
	public void setNume(String nume) {
		this.nume=nume;
	}
	public String getNume() {
		return this.nume;
	}
	
	public void setEsteLucratoare(Boolean esteLucratoare) {
		this.esteLucratoare=esteLucratoare;
	}
	public Boolean getEsteLucratoare() {
		return this.esteLucratoare;
	}
}
