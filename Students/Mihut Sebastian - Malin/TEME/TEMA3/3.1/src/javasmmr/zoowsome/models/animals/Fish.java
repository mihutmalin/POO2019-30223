package javasmmr.zoowsome.models.animals;

public class Fish extends Aquatic{
	Fish(int avgSwimDepth,e waterType){
		this.avgSwimDepth=avgSwimDepth;
		this.waterType=waterType;
	}
	public Fish(){
		this.avgSwimDepth=280;
		this.waterType=e.freshwater;
		super.setNrOfLegs(0);
	}

}
