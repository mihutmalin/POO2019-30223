
public class ClientFidel extends Client implements Comparable<ClientFidel>{
	private int nrPuncte;
	private double discount;
	
	ClientFidel(int id, String nume) {
		super(id, nume);
		this.nrPuncte=(int) (0.08*this.sumaProduse());
		if(this.nrPuncte<100)
			this.discount=0.0;
		else if(this.nrPuncte>100)
			this.discount=10.0;
		else if(this.nrPuncte>200)
			this.discount=20.0;
		else
			this.discount=30.0;
	}
	
	public String toString() {
		return "ClientFidel: "+this.getId()+" "+this.getNume()+" "+nrPuncte+" "+discount;
	}

	@Override
	public int compareTo(ClientFidel other) {
		if(this.sumaProduse()<other.sumaProduse())
			return -1;
		else if(this.sumaProduse()==other.sumaProduse())
			return 0;
		else
			return 1;
	}
	
	
	
}
