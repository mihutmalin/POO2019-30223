package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Spider extends Insect{
	public Spider(String name,Integer nrOfLegs,Boolean canFly,Boolean isDangerous,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.canFly=canFly;
		this.isDangerous=isDangerous;
		}
	public Spider(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.canFly=false;
		this.isDangerous=true;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	Constants.Animals.Insects.Spider);
	}

}
