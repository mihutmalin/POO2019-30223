package javasmmr.zoowsome.controllers;
import java.math.BigDecimal;
import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Fish;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Whale;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
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
		
		ArrayList<Animals> lista1=new ArrayList<Animals>();
		lista1.add(new Whale(7.0,0.5));
		lista1.add(new Fish(0.5,0.1));
		lista1.add(new Shark(4.0,1.0));
		lista1.add(new Parrot(1.0,0.1));
		lista1.add(new Cow(2.3,0.4));
		lista1.add(new Monkey(4.5,0.3));
		lista1.add(new Tiger(7.8,0.9));
		try {
		AnimalRepository animalRepository=new AnimalRepository();
		animalRepository.save(lista1);
		animalRepository.load();
		}
		catch(NullPointerException e) {
		}
		BigDecimal b=new BigDecimal(1500.0);
		BigDecimal c=new BigDecimal(1950.0);
		BigDecimal d=new BigDecimal(2130.0);
		ArrayList<Employee> lista2=new ArrayList<Employee>();
		lista2.add(new Caretaker("Adrian",b,false,15.0));
		lista2.add(new Caretaker("Calina",c,false,32.0));
		lista2.add(new Caretaker("Bogdan",d,true,19.5));
		try {
		EmployeeRepository employeeRepository=new EmployeeRepository();
		employeeRepository.save(lista2);
		employeeRepository.load();
		}
		catch(NullPointerException e) {
		}
	}
	
	
}
