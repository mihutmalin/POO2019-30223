
public class Masina implements Cloneable{
	private String marca;
	private String culoare;
	
	Masina(String marca,String culoare){
		this.marca=marca;
		this.culoare=culoare;
	}
	
	public void setCuloare(String culoare) {
		this.culoare=culoare;
	}
	
	//Shallow copy
	@Override
    protected Masina clone() throws CloneNotSupportedException {
        return (Masina)super.clone();
    }
	
	public String toString() {
		return "masina: "+this.marca+" "+this.culoare;
	}
}
