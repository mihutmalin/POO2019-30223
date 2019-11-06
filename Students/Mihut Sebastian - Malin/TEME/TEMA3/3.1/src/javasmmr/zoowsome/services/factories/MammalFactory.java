package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Tiger;

public class MammalFactory extends SpeciesFactory {
	@Override
	public Animals getAnimal(String type)  throws Exception{
		if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow();
		}
		else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey();
		} 
		else if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger();
		} 
		else {
			throw new Exception("Invalid species exception");
		}
	}
}