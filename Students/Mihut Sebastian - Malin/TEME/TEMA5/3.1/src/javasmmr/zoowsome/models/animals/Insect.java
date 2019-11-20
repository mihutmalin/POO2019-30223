package javasmmr.zoowsome.models.animals;
public abstract class Insect extends Animals {
	public Insect(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	Boolean canFly;
	Boolean isDangerous;
}
