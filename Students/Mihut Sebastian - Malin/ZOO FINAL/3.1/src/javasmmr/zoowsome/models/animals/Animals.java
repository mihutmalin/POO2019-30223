package javasmmr.zoowsome.models.animals;
import java.util.Random;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.Killer;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import org.w3c.dom.Element;

public abstract class Animals implements Killer,XML_Parsable {
	
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

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
		}
	
	public void decodeFromXml( Element element) {
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent() ));
		setName(element.getElementsByTagName("name").item(0).getTextContent()) ;
		//setMaintenanceCost (Double.valueOf(element.getElementsByTagName( "maintenanceCost").item(0).getTextContent())) ;
		//setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0 ).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()) );
		}
	
}
