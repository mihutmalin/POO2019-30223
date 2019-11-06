package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Chicken;
import javasmmr.zoowsome.models.animals.Duck;
import javasmmr.zoowsome.models.animals.Parrot;

public class BirdFactory extends SpeciesFactory{
	@Override
	public Animals getAnimal(String type)   throws Exception{
		if (Constants.Animals.Birds.Parrot.equals(type)) {
			return new Parrot();
		}
		else if (Constants.Animals.Birds.Duck.equals(type)) {
			return new Duck();
		} 
		else if (Constants.Animals.Birds.Chicken.equals(type)) {
			return new Chicken();
		} 
		else {
			throw new Exception("Invalid species exception");
		}
	}
}