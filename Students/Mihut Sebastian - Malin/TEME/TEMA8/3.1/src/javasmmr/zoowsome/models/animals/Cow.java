package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cow extends Mammal{
	public Cow(float normalBodyTemp,float percBodyHair,Double maintenanceCost,Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.normalBodyTemp=normalBodyTemp;
		this.percBodyHair=percBodyHair;
	}
	public Cow(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.normalBodyTemp=36f;
		this.percBodyHair=81.23f;
		super.setNrOfLegs(4);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	Constants.Animals.Mammals.Cow);
	}
}
