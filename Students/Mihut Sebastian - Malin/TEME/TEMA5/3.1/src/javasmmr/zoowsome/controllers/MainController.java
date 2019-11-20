package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.animals.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.animals.SpeciesFactory;
import javasmmr.zoowsome.services.factories.employees.EmployeeFactory;

public class MainController {
	public static void randomCreate(Animals[] arr,int nr) throws Exception{
		javasmmr.zoowsome.services.factories.animals.AnimalFactory abstractFactory = new AnimalFactory();
		
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		SpeciesFactory speciesFactory4= abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory speciesFactory5 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		
		int k=1;
		for(int i=0;i<nr;i++) {
			arr[i] = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Whale);
			arr[i].setName("Whale"+Integer.toString(k));
			k++;
		}		
		k=1;
		for(int i=nr;i<2*nr;i++) {
			arr[i] = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Fish);
			arr[i].setName("Fish"+Integer.toString(k));
			k++;
		}
		k=1;
		for(int i=2*nr;i<3*nr;i++) {
			arr[i] = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Shark);
			arr[i].setName("Shark"+Integer.toString(k));
			k++;
		}
		k=1;
		for(int i=3*nr;i<4*nr;i++) {
			arr[i] = speciesFactory2.getAnimal(Constants.Animals.Mammals.Cow);
			arr[i].setName("Cow"+Integer.toString(k));
			k++;
		}		
		k=1;
		for(int i=4*nr;i<5*nr;i++) {
			arr[i] = speciesFactory2.getAnimal(Constants.Animals.Mammals.Tiger);
			arr[i].setName("Tiger"+Integer.toString(k));
			k++;
		}
		k=1;
		for(int i=5*nr;i<6*nr;i++) {
			arr[i] = speciesFactory2.getAnimal(Constants.Animals.Mammals.Monkey);
			arr[i].setName("Monkey"+Integer.toString(k));
			k++;
		}
		k=1;
		for(int i=6*nr;i<7*nr;i++) {
			arr[i] = speciesFactory3.getAnimal(Constants.Animals.Insects.Cockroach);
			arr[i].setName("Cockroach"+Integer.toString(k));
			k++;
		}		
		k=1;
		for(int i=7*nr;i<8*nr;i++) {
			arr[i] = speciesFactory3.getAnimal(Constants.Animals.Insects.Butterfly);
			arr[i].setName("Butterfly"+Integer.toString(k));
			k++;
		}
		k=1;
		for(int i=8*nr;i<9*nr;i++) {
			arr[i] = speciesFactory3.getAnimal(Constants.Animals.Insects.Spider);
			arr[i].setName("Spider"+Integer.toString(k));
			k++;
		}
		k=1;
		for(int i=9*nr;i<10*nr;i++) {
			arr[i] = speciesFactory4.getAnimal(Constants.Animals.Birds.Duck);
			arr[i].setName("Duck"+Integer.toString(k));
			k++;
		}		
		k=1;
		for(int i=10*nr;i<11*nr;i++) {
			arr[i] = speciesFactory4.getAnimal(Constants.Animals.Birds.Chicken);
			arr[i].setName("Chicken"+Integer.toString(k));
			k++;
		}
		k=1;
		for(int i=11*nr;i<12*nr;i++) {
			arr[i] = speciesFactory4.getAnimal(Constants.Animals.Birds.Parrot);
			arr[i].setName("Parrot"+Integer.toString(k));
			k++;
		}
		k=1;
		for(int i=12*nr;i<13*nr;i++) {
			arr[i] = speciesFactory5.getAnimal(Constants.Animals.Reptiles.Turtle);
			arr[i].setName("Turtle"+Integer.toString(k));
			k++;
		}		
		k=1;
		for(int i=13*nr;i<14*nr;i++) {
			arr[i] = speciesFactory5.getAnimal(Constants.Animals.Reptiles.Chameleon);
			arr[i].setName("Chameleon"+Integer.toString(k));
			k++;
		}
		k=1;
		for(int i=14*nr;i<15*nr;i++) {
			arr[i] = speciesFactory5.getAnimal(Constants.Animals.Reptiles.Snake);
			arr[i].setName("Snake"+Integer.toString(k));
			k++;
		}
	}
	
	public static void main(String[] args) throws Exception {
		Animals[] animals=new Animals[100];
		randomCreate(animals,1);
		
		System.out.println("La Zoowsome Cluj avem urmatoarele animale descrise de numarul lor de picioare:");
		int i=0;
		while(animals[i]!=null){
			System.out.println(animals[i].getName()+" cu "+animals[i].getNrOfLegs()+" picioare");
			i++;
		}
		
		Employee[] employees=new Employee[100];
		EmployeeFactory employeeFactory =new EmployeeFactory();
		
		
		for(int j=0;j<3;j++) {
			employees[j]=employeeFactory.getEmployeeFactory(Constants.Employees.Caretaker).getEmployee(Constants.Employees.Caretaker);
		}
		
		for(Employee c:employees) {
			if(c!=null) {
				if(c instanceof Caretaker) {
					for(Animals a:animals){
						if(c.getIsDead()==false && a.getTakenCareOf()==false){
								String result = ((Caretaker)c).takeCareOf(a);
								if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
									c.setIsDead(true);
								}
								else if(result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
									break;
								}
								else {
									a.setTakenCareOf(true);
								}
						}
					}
				}
			}
		}
		for(Employee c:employees) {
			if(c!=null) {
				System.out.println("Acest angajat este mort? "+c.getIsDead());
			}
		}
		for(Animals a:animals){
			if(a!=null) {
				System.out.println("S-a avut grija de "+a.getName()+" ? "+a.getTakenCareOf());
			}
		}
	}
}
