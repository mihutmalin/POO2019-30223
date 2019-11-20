package javasmmr.zoowsome.models.animals;
public abstract class Mammal extends Animals {
	public Mammal(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	public float normalBodyTemp;
	public float percBodyHair;

}
