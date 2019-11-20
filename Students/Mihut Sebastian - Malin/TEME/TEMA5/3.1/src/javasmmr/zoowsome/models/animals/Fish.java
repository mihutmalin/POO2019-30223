package javasmmr.zoowsome.models.animals;

public class Fish extends Aquatic{
	Fish(int avgSwimDepth,e waterType,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.avgSwimDepth=avgSwimDepth;
		this.waterType=waterType;
	}
	public Fish(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.avgSwimDepth=280;
		this.waterType=e.freshwater;
		super.setNrOfLegs(0);
	}

}
