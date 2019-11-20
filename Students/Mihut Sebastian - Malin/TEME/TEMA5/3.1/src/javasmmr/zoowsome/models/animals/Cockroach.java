package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect{
	public Cockroach(Boolean canFly,Boolean isDangerous,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.canFly=canFly;
		this.isDangerous=isDangerous;
		}
	public Cockroach(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.canFly=true;
		this.isDangerous=false;
		super.setNrOfLegs(8);
	}
}
