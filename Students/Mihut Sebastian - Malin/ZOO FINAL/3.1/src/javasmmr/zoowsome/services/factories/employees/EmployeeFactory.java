package javasmmr.zoowsome.services.factories.employees;

import javasmmr.zoowsome.services.factories.Constants;

public class EmployeeFactory{
	public EmployeeAbstractFactory getEmployeeFactory(String type) {
		if(Constants.Employees.Caretaker.equals(type)) {
			return new CaretakerFactory();
		}
		else
			return null;
	}
}
