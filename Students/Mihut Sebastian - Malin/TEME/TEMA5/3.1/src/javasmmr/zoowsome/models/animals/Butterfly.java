package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{
	public Butterfly(Boolean canFly,Boolean isDangerous,Double maintenanceCost,Double dangerPerc){
	super(maintenanceCost, dangerPerc);
	this.canFly=canFly;
	this.isDangerous=isDangerous;
	}
	public Butterfly(Double maintenanceCost,Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.canFly=true;
		this.isDangerous=false;
		super.setNrOfLegs(0);
	}
}
