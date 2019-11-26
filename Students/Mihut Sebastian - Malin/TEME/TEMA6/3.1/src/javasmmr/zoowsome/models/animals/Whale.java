package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

public class Whale extends Aquatic{
	public Whale(int avgSwimDepth,e waterType,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.avgSwimDepth=avgSwimDepth;
		this.waterType=waterType;
	}
	public Whale(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.avgSwimDepth=1510;
		this.waterType=e.saltwater;
		super.setNrOfLegs(0);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Aquatics.Whale);
	}
}
