
public class Dog {
	private String name;
	private String breed;
	private int age;
	
	Dog(String name,String breed,int age){
		this.name=name;
		this.breed=breed;
		this.age=age;
	}
	
	public void listDog() {
		System.out.print("Cainele: "+this.name+",rasa: "+this.breed+",cu varsta de: "+this.age+" ani");
	}
}
