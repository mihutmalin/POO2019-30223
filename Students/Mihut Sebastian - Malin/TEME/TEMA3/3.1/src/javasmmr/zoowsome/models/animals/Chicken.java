package javasmmr.zoowsome.models.animals;

public class Chicken extends Bird{
	public Chicken(Boolean migrates,Integer avgFlightAltitude){
		this.migrates=migrates;
		this.avgFlightAltitude=avgFlightAltitude;
	}
	public Chicken(){
		this.migrates=false;
		this.avgFlightAltitude=0;
		super.setNrOfLegs(2);
	}

}
