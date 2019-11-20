package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import javasmmr.zoowsome.Caretaker_I;
import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I{
	private Double workingHours;
	
	public Caretaker(String newName,BigDecimal newSalary,Boolean a,Double newWorkingHours){
		super(newName,newSalary,a);
		this.workingHours=newWorkingHours;
		
	}
	
	public Double getWorkingHours() {
		return this.workingHours;
	}
	public void setTakenCareOf(Double newWorkingHours) {
		this.workingHours=newWorkingHours;
	}

	@Override
	public String takeCareOf(Animals a) {
		if (a.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if (this.workingHours < a.getMaintenanceCost()){
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		a.setTakenCareOf(true);
		this.workingHours=this.workingHours-a.getMaintenanceCost();
			
		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}
}
