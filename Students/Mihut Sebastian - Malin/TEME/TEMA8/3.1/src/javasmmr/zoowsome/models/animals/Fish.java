package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Fish extends Aquatic{
	Fish(int avgSwimDepth,e waterType,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.avgSwimDepth=avgSwimDepth;
		this.waterType=waterType;
	}
	public Fish(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.avgSwimDepth=280;
		this.waterType=e.freshwater;
		super.setNrOfLegs(0);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	Constants.Animals.Aquatics.Fish);
	}

}
