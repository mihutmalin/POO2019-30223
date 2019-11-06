package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{
	public Butterfly(Boolean canFly,Boolean isDangerous){
	this.canFly=canFly;
	this.isDangerous=isDangerous;
	}
	public Butterfly(){
		this.canFly=true;
		this.isDangerous=false;
		super.setNrOfLegs(0);
	}
}
