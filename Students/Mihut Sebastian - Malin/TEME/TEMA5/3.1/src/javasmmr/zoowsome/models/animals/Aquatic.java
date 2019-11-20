package javasmmr.zoowsome.models.animals;
enum e { saltwater,freshwater; } 

public abstract class Aquatic extends Animals {
	public Aquatic(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	Integer avgSwimDepth;
	e waterType;

}
