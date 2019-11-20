package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic{
	public Shark(int avgSwimDepth,e waterType,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.avgSwimDepth=avgSwimDepth;
		this.waterType=waterType;
	}
	public Shark(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.avgSwimDepth=510;
		this.waterType=e.saltwater;
		super.setNrOfLegs(0);
	}

}
