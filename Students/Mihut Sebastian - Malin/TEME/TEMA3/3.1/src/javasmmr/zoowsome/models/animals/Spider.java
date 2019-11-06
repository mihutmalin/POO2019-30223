package javasmmr.zoowsome.models.animals;

public class Spider extends Insect{
	public Spider(Boolean canFly,Boolean isDangerous){
		this.canFly=canFly;
		this.isDangerous=isDangerous;
		}
	public Spider(){
		this.canFly=false;
		this.isDangerous=true;
		super.setNrOfLegs(8);
	}

}
