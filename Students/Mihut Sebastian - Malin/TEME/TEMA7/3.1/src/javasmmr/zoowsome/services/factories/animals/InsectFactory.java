package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.services.factories.Constants;

public class InsectFactory extends SpeciesFactory{
	@Override
	public Animals getAnimal(String type){
		if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider(0.7,0.6);
		}
		else if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly(0.2,0.1);
		} 
		else if (Constants.Animals.Insects.Cockroach.equals(type)) {
			return new Cockroach(0.5,0.1);
		} 
		else 
			return null;
	}
}