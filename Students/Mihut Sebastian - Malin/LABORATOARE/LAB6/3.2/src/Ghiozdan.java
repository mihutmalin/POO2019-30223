import java.util.ArrayList;

public class Ghiozdan {
	private ArrayList<Rechizita> lista=new ArrayList<Rechizita>();
	
	public void addCaiet() {
		lista.add(new Caiet());
	}
	
	public void addManual() {
		lista.add(new Manual());
	}

	public void listItems() {
		for(Rechizita c:lista) {
			System.out.println(c.getEticheta());
		}
	}
	
	public void listManual() {
		for(Rechizita c:lista) {
			if(c.getClass().getName()=="Manual") {
				System.out.println(c.getNume());
			}
		}
	}
	
	public void listCaiet() {
		for(Rechizita c:lista) {
			if(c.getClass().getName()=="Caiet") {
				System.out.println(c.getNume());
			}
		}
	}
	
	public int getNrRechizite() {
		int count=0;
		for(Rechizita c:lista) {
			count++;
		}
		return count;
	}
	
	public int getNrManuale() {
		int count=0;
		for(Rechizita c:lista) {
			if(c.getClass().getName()=="Manual") {
				count++;
			}
		}
		return count;
	}
	
	public int getNrCaiete() {
		int count=0;
		for(Rechizita c:lista) {
			if(c.getClass().getName()=="Caiet") {
				count++;
			}
		}
		return count;
	}
}
