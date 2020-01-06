package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Chameleon extends Reptile{
	Chameleon(String name,Integer nrOfLegs,boolean laysEggs,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.laysEggs=laysEggs;
	}
	public Chameleon(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.laysEggs=false;
		super.setNrOfLegs(4);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	Constants.Animals.Reptiles.Chameleon);
	}
	
}
