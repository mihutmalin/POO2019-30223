package javasmmr.zoowsome.models.animals;

public class Chicken extends Bird{
	public Chicken(Boolean migrates,Integer avgFlightAltitude,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.migrates=migrates;
		this.avgFlightAltitude=avgFlightAltitude;
	}
	public Chicken(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.migrates=false;
		this.avgFlightAltitude=0;
		super.setNrOfLegs(2);
	}

}
