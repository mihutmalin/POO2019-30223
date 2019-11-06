package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Chameleon;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Turtle;

public class ReptileFactory extends SpeciesFactory{
	@Override
	public Animals getAnimal(String type)  throws Exception{
		if (Constants.Animals.Reptiles.Chameleon.equals(type)) {
			return new Chameleon(); 
		}
		else if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake();
		} 
		else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle();
		} 
		else {
			throw new Exception("Invalid species exception");
		}
	}
}