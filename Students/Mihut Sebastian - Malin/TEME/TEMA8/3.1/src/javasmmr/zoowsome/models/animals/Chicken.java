package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Chicken extends Bird{
	public Chicken(Boolean migrates,Integer avgFlightAltitude,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.migrates=migrates;
		this.avgFlightAltitude=avgFlightAltitude;
	}
	public Chicken(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.migrates=false;
		this.avgFlightAltitude=0;
		super.setNrOfLegs(2);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	Constants.Animals.Birds.Chicken);
	}

}
