package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird{
	public Parrot(Boolean migrates,Integer avgFlightAltitude,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.migrates=migrates;
		this.avgFlightAltitude=avgFlightAltitude;
	}
	public Parrot(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.migrates=true;
		this.avgFlightAltitude=300;
		super.setNrOfLegs(2);
	}
}
