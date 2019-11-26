package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Monkey extends Mammal{
	public Monkey(float normalBodyTemp,float percBodyHair,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.normalBodyTemp=normalBodyTemp;
		this.percBodyHair=percBodyHair;
	}
	public Monkey(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.normalBodyTemp=38f;
		this.percBodyHair=87.83f;
		super.setNrOfLegs(2);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	Constants.Animals.Mammals.Monkey);
	}

}
