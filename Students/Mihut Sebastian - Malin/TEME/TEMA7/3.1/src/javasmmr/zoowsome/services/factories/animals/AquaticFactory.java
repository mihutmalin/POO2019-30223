package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Fish;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Whale;
import javasmmr.zoowsome.services.factories.Constants;

public class AquaticFactory extends SpeciesFactory  {
	@Override
	public Animals getAnimal(String type)  {
		if (Constants.Animals.Aquatics.Whale.equals(type)) {
			
			return new Whale(7.0,0.5);
		}
		else if (Constants.Animals.Aquatics.Fish.equals(type)) {
			return new Fish(0.5,0.1);
		} 
		else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark(4.0,1.0);
		} 
		else
			return null;
	}
}