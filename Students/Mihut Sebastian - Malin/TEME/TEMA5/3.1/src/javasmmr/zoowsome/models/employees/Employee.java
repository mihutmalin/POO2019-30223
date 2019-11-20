package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Employee {
	private String name;
	private Long id;
	private BigDecimal salary;
	private Boolean isDead=false;
	
	Employee(String newName,BigDecimal newSalary,Boolean a){
		this.name=newName;
		this.salary=newSalary;
		this.isDead=a;
		this.id=generateRandomNumber();
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public BigDecimal getSalary() {
		return this.salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary=salary;
	}
	
	public Boolean getIsDead() {
		return this.isDead;
	}
	public void setIsDead(Boolean isDead) {
		this.isDead=isDead;
	}
	
	private long generateRandomNumber() {
	    long min = (long) Math.pow(10, 12);
	    return ThreadLocalRandom.current().nextLong(min, min * 10);
	}
}
