import java.util.Arrays;

public class Supermarket {
	Angajat listaAngajati[]=new Angajat[100];
	private int itA=0;
	private int nrAngajati=0;
	ClientFidel listaClientiFideli[]=new ClientFidel[100];
	private int itC=0;
	private int nrClientiFideli=0;
	
	//Care dintre Clientiifideli adauga un produs
	public void addProdus(Produs produs,int cine) {
		if(listaClientiFideli[cine]!=null)
			listaClientiFideli[cine].addProdus(produs);
	}
	
	public void addAngajat(Angajat angajat) {
		if(this.itA<listaAngajati.length) {
			this.listaAngajati[this.itA]=angajat;
			this.itA++;
			this.nrAngajati++;
		}
	}
	
	public void addClientFidel(ClientFidel clientFidel) {
		if(this.itC<listaClientiFideli.length) {
			this.listaClientiFideli[this.itC]=clientFidel;
			this.itC++;
			this.nrClientiFideli++;
		}
	}
	
	public void listClientiFideliSortati() {
		Arrays.sort(this.listaClientiFideli,0,nrClientiFideli);
		System.out.println("ClientiiFideli sortati sunt:");
		for(ClientFidel cf:this.listaClientiFideli) {
			if(cf!=null)
				System.out.println(cf);
		}
		System.out.println();
	}
	
	public void listAngajatiSortati() {
		Arrays.sort(this.listaAngajati,0,nrAngajati);
		System.out.println("Angajatii sortati sunt:");
		for(Angajat a:this.listaAngajati) {
			if(a!=null)
				System.out.println(a);
		}
		System.out.println();
	}
	
	public void createStatistici() {
		int nrProduseClienti=0;
		int nrProduseClientiFideli=0;
		int countClienti=0;
		int countClientiFideli=0;
		for(Angajat a:this.listaAngajati) {
			if(a!=null) {
				for(Client c:a.listaClienti) {
					if(c.getClass().getName().equals("Client")) {
						countClienti++;
						nrProduseClienti +=c.getNrProduseCumparate();
					}
					else if(c.getClass().getName().equals("ClientFidel")) {
						countClientiFideli++;
						nrProduseClientiFideli +=c.getNrProduseCumparate();
					}
				}
		}
		}
		System.out.println("Cei "+countClienti+" clienti au cumparat: "+nrProduseClienti+" produse");
		System.out.println("Cei "+countClientiFideli+" clienti au cumparat: "+nrProduseClientiFideli+" produse");
	}
	
}
