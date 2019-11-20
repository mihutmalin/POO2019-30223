package javasmmr.zoowsome.models.animals;

public class Spider extends Insect{
	public Spider(Boolean canFly,Boolean isDangerous,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.canFly=canFly;
		this.isDangerous=isDangerous;
		}
	public Spider(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.canFly=false;
		this.isDangerous=true;
		super.setNrOfLegs(8);
	}

}
