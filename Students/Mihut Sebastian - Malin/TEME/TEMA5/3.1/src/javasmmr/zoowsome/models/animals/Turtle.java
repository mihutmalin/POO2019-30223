package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile{
	public Turtle(boolean laysEggs,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.laysEggs=laysEggs;
	}
	public Turtle(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.laysEggs=true;
		super.setNrOfLegs(4);
	}

}
