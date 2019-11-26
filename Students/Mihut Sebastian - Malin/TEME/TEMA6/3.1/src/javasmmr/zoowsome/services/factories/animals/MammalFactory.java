package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.services.factories.Constants;

public class MammalFactory extends SpeciesFactory {
	@Override
	public Animals getAnimal(String type){
		if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow(2.3,0.4);
		}
		else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey(4.5,0.3);
		} 
		else if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger(7.8,0.9);
		} 
		else 
			return null;
	}
}