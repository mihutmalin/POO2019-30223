package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{
	public Monkey(float normalBodyTemp,float percBodyHair){
		this.normalBodyTemp=normalBodyTemp;
		this.percBodyHair=percBodyHair;
	}
	public Monkey(){
		this.normalBodyTemp=38f;
		this.percBodyHair=87.83f;
		super.setNrOfLegs(2);
	}

}
