package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Chameleon;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Turtle;
import javasmmr.zoowsome.services.factories.Constants;

public class ReptileFactory extends SpeciesFactory{
	@Override
	public Animals getAnimal(String type){
		if (Constants.Animals.Reptiles.Chameleon.equals(type)) {
			return new Chameleon(2.1,0.2); 
		}
		else if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake(3.3,0.8);
		} 
		else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle(4.9,0.1);
		} 
		else 
			return null;
	}
}