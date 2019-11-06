package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic{
	public Shark(int avgSwimDepth,e waterType){
		this.avgSwimDepth=avgSwimDepth;
		this.waterType=waterType;
	}
	public Shark(){
		this.avgSwimDepth=510;
		this.waterType=e.saltwater;
		super.setNrOfLegs(0);
	}

}
