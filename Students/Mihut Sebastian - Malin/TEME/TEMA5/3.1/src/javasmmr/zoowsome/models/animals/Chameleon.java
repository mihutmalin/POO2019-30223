package javasmmr.zoowsome.models.animals;

public class Chameleon extends Reptile{
	Chameleon(boolean laysEggs,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.laysEggs=laysEggs;
	}
	public Chameleon(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.laysEggs=false;
		super.setNrOfLegs(4);
	}

}
