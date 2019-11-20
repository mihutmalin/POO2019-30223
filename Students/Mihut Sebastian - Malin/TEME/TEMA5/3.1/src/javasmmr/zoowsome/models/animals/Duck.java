package javasmmr.zoowsome.models.animals;

public class Duck extends Bird{
	Duck(Boolean migrates,Integer avgFlightAltitude,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.migrates=migrates;
		this.avgFlightAltitude=avgFlightAltitude;
	}
	public Duck(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.migrates=false;
		this.avgFlightAltitude=0;
		super.setNrOfLegs(2);
	}

}
