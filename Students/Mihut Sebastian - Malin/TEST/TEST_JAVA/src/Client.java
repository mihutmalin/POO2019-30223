
public class Client extends Persoana {
	private int nrProduseCumparate;
	Produs listaProduse[]=new Produs[nrProduseCumparate];
	private int it=0;
	
	Client(int id, String nume) {
		super(id, nume);
		Produs listaProduse[]=new Produs[nrProduseCumparate];
	}
	
	public String toString() {
		return "Client: "+this.getId()+" "+this.getNume();
	}
	
	public void addProdus(Produs produs) {
		if(it<nrProduseCumparate) {
			listaProduse[it]=produs;
			it++;
		}
	}
	
	public double sumaProduse() {
		double suma=0;
		for(Produs p:this.listaProduse) {
			suma=suma+p.getPret();
		}
		return suma; 
	}
	
	public int getNrProduseCumparate() {
		return this.getNrProduseCumparate();
	}
}
