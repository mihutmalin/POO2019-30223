package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	public Cow(float normalBodyTemp,float percBodyHair){
		this.normalBodyTemp=normalBodyTemp;
		this.percBodyHair=percBodyHair;
	}
	public Cow(){
		this.normalBodyTemp=36f;
		this.percBodyHair=81.23f;
		super.setNrOfLegs(4);
	}
}
