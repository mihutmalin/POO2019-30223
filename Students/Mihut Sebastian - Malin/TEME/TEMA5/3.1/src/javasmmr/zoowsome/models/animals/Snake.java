package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile{
	public Snake(boolean laysEggs,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.laysEggs=laysEggs;
	}
	public Snake(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.laysEggs=true;
		super.setNrOfLegs(0);
	}
}
