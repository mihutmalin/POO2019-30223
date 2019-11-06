package javasmmr.zoowsome.models.animals;

public class Chameleon extends Reptile{
	Chameleon(boolean laysEggs){
		this.laysEggs=laysEggs;
	}
	public Chameleon(){
		this.laysEggs=false;
		super.setNrOfLegs(4);
	}

}
