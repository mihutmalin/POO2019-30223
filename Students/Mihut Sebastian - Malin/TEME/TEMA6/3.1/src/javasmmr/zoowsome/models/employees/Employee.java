package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

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
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
		}
	
	public void decodeFromXml( Element element) {
		setName(element.getElementsByTagName("name").item(0).getTextContent()) ;
		//setSalary (BigDecimal.valueOf(element.getElementsByTagName( "salary").item(0).getTextContent())) ;
		setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
		}
}
