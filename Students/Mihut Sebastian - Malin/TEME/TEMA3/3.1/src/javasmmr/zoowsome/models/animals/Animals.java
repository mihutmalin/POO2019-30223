package javasmmr.zoowsome.models.animals;

public abstract class Animals {
	private Integer nrOfLegs;
	private String name;
	
	public Integer getNrOfLegs() {
		return this.nrOfLegs;
	}
	public void setNrOfLegs(Integer newNumberOfLegs) {
		this.nrOfLegs=newNumberOfLegs;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String newName) {
		this.name=newName;
	}
}
