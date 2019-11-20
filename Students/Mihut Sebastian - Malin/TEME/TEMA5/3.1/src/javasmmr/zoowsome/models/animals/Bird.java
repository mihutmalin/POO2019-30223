package javasmmr.zoowsome.models.animals;
public abstract class Bird extends Animals {
	public Bird(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	Boolean migrates;
	Integer avgFlightAltitude;
}
