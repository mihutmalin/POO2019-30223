package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	public Tiger(float normalBodyTemp,float percBodyHair,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.normalBodyTemp=normalBodyTemp;
		this.percBodyHair=percBodyHair;
	}
	public Tiger(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.normalBodyTemp=37f;
		this.percBodyHair=91.78f;
		super.setNrOfLegs(4);
	}

}
