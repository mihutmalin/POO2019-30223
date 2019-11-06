package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile{
	public Snake(boolean laysEggs){
		this.laysEggs=laysEggs;
	}
	public Snake(){
		this.laysEggs=true;
		super.setNrOfLegs(0);
	}
}
