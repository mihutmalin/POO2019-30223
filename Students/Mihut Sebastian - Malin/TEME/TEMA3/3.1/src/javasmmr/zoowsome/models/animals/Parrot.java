package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird{
	public Parrot(Boolean migrates,Integer avgFlightAltitude){
		this.migrates=migrates;
		this.avgFlightAltitude=avgFlightAltitude;
	}
	public Parrot(){
		this.migrates=true;
		this.avgFlightAltitude=300;
		super.setNrOfLegs(2);
	}
}
