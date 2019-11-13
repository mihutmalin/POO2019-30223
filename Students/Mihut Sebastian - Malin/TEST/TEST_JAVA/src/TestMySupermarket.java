public class TestMySupermarket {

	public static void main(String[] args) {
		Supermarket supermarket=new Supermarket();
		
		supermarket.addAngajat(new Angajat(13,"Alin","01.01.2018",3));
		supermarket.addAngajat(new Angajat(13,"Alina","04.09.2016",10));
		
		
		supermarket.addClientFidel(new ClientFidel(25,"Mihai"));
		supermarket.addClientFidel(new ClientFidel(40,"Mariana"));
		supermarket.addClientFidel(new ClientFidel(100,"Daniel"));	
		
		supermarket.addProdus(new Produs("Ciocoata",3,100), 0);
		supermarket.addProdus(new Produs("Paine",2,555), 1);
		supermarket.addProdus(new Produs("Ciocoata",3,100), 2);
		
		//Nu am apucat sa populez sirurile cu produse si angajati cum trebuie de aceea arata in unele locuri 0
		supermarket.listAngajatiSortati();
		supermarket.listClientiFideliSortati();
		supermarket.createStatistici();
		
	}

}
