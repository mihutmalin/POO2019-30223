package javasmmr.zoowsome.services.factories.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.Constants;

public class CaretakerFactory extends EmployeeAbstractFactory{
	public Employee getEmployee(String type){
		if (Constants.Employees.Caretaker.equals(type)) {
			BigDecimal temp=new BigDecimal(0);
			return new Caretaker("Name",temp,false,20.0);
		}
		else 
			return null;
	}

}
