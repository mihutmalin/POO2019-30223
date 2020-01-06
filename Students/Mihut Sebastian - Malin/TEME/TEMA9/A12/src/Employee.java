
public class Employee {
	 private String name;
	 private int age;
	 private double salary;
	 
	 
	 public Employee(String name, int age,double salary) {
		 this.name=name;
		 this.age=age;
		 this.setSalary(salary);
	 }


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
}
