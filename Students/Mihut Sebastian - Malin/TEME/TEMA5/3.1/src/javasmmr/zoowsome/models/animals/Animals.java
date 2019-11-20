package javasmmr.zoowsome.models.animals;
import java.util.Random;

import javasmmr.zoowsome.Killer;

public abstract class Animals implements Killer {
	
	private Boolean takenCareOf=false;
	private final Double maintenanceCost;
	private final Double dangerPerc;
	private Integer nrOfLegs=0;
	private String name="Unknown";

	public Animals(Double maintenanceCost,Double dangerPerc){
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	

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
	
	public boolean kill() {
		Random rand=new Random();
		Double nr=(rand.nextInt(100))/100.0;
		if(nr<this.dangerPerc)
			return true;
		else 
			return false;
	}

	public Boolean getTakenCareOf() {
		return this.takenCareOf;
	}
	public void setTakenCareOf(Boolean newTakenCareOf) {
		this.takenCareOf=newTakenCareOf;
	}
	
	public Double getMaintenanceCost() {
		return this.maintenanceCost;
	}
	
	public Double getDangerPerc() {
		return this.dangerPerc;
	}

	
	
}
