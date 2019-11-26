
public class Student implements Cloneable{
	private String nume;
	private String prenume;
	private Masina masina;
	
	Student(String nume,String prenume,Masina masina){
		this.nume=nume;
		this.prenume=prenume;
		this.masina=masina;
	}
	
	public void setMasina(Masina masina) {
		this.masina=masina;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public String getPrenume() {
		return this.prenume;
	}
	
	public Masina getMasina() {
		return this.masina;
	}

	//Deep copy
	@Override
	protected Student clone() throws CloneNotSupportedException {
      Student student=(Student)super.clone();
      student.masina=masina.clone();
      return student;
	}
	
	public String toString() {
		return "Student: "+this.nume+" "+this.prenume+" care detine "+this.masina.toString();
	}
}
