
public class Produs {
	private String nume;
	private double pret;
	private int nrExemplare;
	
	Produs(String nume,double pret,int nrExemplare){
		this.nume=nume;
		this.pret=pret;
		this.nrExemplare=nrExemplare;
	}
	
	public int isInStoc() {
		if(this.nrExemplare>0)
			return 1;//daca e in stoc
		else 
			return 0;//daca nu e in stoc
	}
	
	public double getPret() {
		return this.pret;
	}
}
