package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic{
	public Whale(int avgSwimDepth,e waterType,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.avgSwimDepth=avgSwimDepth;
		this.waterType=waterType;
	}
	public Whale(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.avgSwimDepth=1510;
		this.waterType=e.saltwater;
		super.setNrOfLegs(0);
	}
}
