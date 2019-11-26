package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Butterfly extends Insect{
	public Butterfly(Boolean canFly,Boolean isDangerous,Double maintenanceCost,Double dangerPerc){
	super(maintenanceCost, dangerPerc);
	this.canFly=canFly;
	this.isDangerous=isDangerous;
	}
	public Butterfly(Double maintenanceCost,Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.canFly=true;
		this.isDangerous=false;
		super.setNrOfLegs(0);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	Constants.Animals.Insects.Butterfly);
	}

}
