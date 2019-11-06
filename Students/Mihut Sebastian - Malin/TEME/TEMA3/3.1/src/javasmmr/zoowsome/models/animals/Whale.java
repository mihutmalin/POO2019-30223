package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic{
	public Whale(int avgSwimDepth,e waterType){
		this.avgSwimDepth=avgSwimDepth;
		this.waterType=waterType;
	}
	public Whale(){
		this.avgSwimDepth=1510;
		this.waterType=e.saltwater;
		super.setNrOfLegs(0);
	}
}
