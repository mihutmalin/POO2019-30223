import java.util.Arrays;

public class Persoana implements Comparable {
	private String nume;
	private String prenume;
	private int varsta;
	
	public String getNume() {
		return this.nume;
	}
	public void setNume(String nume) {
		this.nume=nume;
	}
	
	@Override
	public int compareTo(Object other) {
		return this.nume.compareTo(((Persoana)other).getNume());
	}
	
	public static void main(String[] args) {
		Persoana[] persoane=new Persoana[10];
		for(int i=0;i<10;i++)
			persoane[i]=new Persoana();
		persoane[0].setNume("Vasiciuc");
		persoane[1].setNume("Alder");
		persoane[2].setNume("Krist");
		persoane[3].setNume("Mihut");
		persoane[4].setNume("Balboi");
		persoane[5].setNume("Zoican");
		persoane[6].setNume("Carlshrue");
		persoane[7].setNume("Anaciuc");
		persoane[8].setNume("Bala");
		persoane[9].setNume("Darian");
		Arrays.sort(persoane);
		for(Persoana p:persoane) {
			if(p!=null)
				System.out.println(p.getNume());
		}
	}
	
}
