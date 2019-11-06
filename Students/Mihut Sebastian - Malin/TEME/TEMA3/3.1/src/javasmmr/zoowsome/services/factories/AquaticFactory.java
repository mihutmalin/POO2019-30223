package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Fish;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Whale;

public class AquaticFactory extends SpeciesFactory  {
	@Override
	public Animals getAnimal(String type) throws Exception  {
		if (Constants.Animals.Aquatics.Whale.equals(type)) {
			return new Whale();
		}
		else if (Constants.Animals.Aquatics.Fish.equals(type)) {
			return new Fish();
		} 
		else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark();
		} 
		else {
			throw new Exception("Invalid species exception");
		}
	}
}