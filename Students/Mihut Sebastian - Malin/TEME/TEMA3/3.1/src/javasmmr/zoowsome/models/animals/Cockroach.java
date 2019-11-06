package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect{
	public Cockroach(Boolean canFly,Boolean isDangerous){
		this.canFly=canFly;
		this.isDangerous=isDangerous;
		}
	public Cockroach(){
		this.canFly=true;
		this.isDangerous=false;
		super.setNrOfLegs(8);
	}
}
