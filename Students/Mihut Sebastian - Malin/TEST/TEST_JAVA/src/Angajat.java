
public class Angajat extends Persoana implements Comparable<Angajat>{
	private String dataAngajarii;
	private int nrClientiServiti;
	Client listaClienti[]=new Client[nrClientiServiti];
	
	Angajat(int id, String nume,String dataAngajarii,int nrClientiServiti) {
		super(id, nume);
		this.dataAngajarii=dataAngajarii;
		this.nrClientiServiti=nrClientiServiti;
		Client listaClienti[]=new Client[nrClientiServiti];
	}
	
	public double serveste(Client client) {
		double suma=0;
		for(Produs p:client.listaProduse) {
			suma=suma+p.getPret();
		}
		return suma;
	}
	
	public String toString() {
		return "Angajat: "+this.getId()+" "+this.getNume()+" "+this.dataAngajarii+" "+this.nrClientiServiti;
	}

	@Override
	public int compareTo(Angajat other) {
		if(this.nrClientiServiti<other.nrClientiServiti)
			return -1;
		else if(this.nrClientiServiti==other.nrClientiServiti)
			return 0;
		else
			return 1;
	}
}
