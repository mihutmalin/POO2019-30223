package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Shark extends Aquatic{
	public Shark(String name,Integer nrOfLegs,int avgSwimDepth,e waterType,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.avgSwimDepth=avgSwimDepth;
		this.waterType=waterType;
	}
	public Shark(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.avgSwimDepth=510;
		this.waterType=e.saltwater;
		super.setNrOfLegs(0);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	Constants.Animals.Aquatics.Shark);
	}

}
