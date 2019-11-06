package javasmmr.zoowsome.models.animals;

public class Duck extends Bird{
	Duck(Boolean migrates,Integer avgFlightAltitude){
		this.migrates=migrates;
		this.avgFlightAltitude=avgFlightAltitude;
	}
	public Duck(){
		this.migrates=false;
		this.avgFlightAltitude=0;
		super.setNrOfLegs(2);
	}

}
