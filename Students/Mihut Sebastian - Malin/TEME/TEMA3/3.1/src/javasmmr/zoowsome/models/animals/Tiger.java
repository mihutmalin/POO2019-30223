package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	public Tiger(float normalBodyTemp,float percBodyHair){
		this.normalBodyTemp=normalBodyTemp;
		this.percBodyHair=percBodyHair;
	}
	public Tiger(){
		this.normalBodyTemp=37f;
		this.percBodyHair=91.78f;
		super.setNrOfLegs(4);
	}

}
