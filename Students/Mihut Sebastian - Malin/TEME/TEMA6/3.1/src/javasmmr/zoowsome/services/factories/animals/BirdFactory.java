package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Chicken;
import javasmmr.zoowsome.models.animals.Duck;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.services.factories.Constants;

public class BirdFactory extends SpeciesFactory{
	@Override
	public Animals getAnimal(String type){
		if (Constants.Animals.Birds.Parrot.equals(type)) {
			return new Parrot(1.0,0.1);
		}
		else if (Constants.Animals.Birds.Duck.equals(type)) {
			return new Duck(2.5,0.2);
		} 
		else if (Constants.Animals.Birds.Chicken.equals(type)) {
			return new Chicken(1.5,0.1);
		} 
		else 
			return null;}
	}