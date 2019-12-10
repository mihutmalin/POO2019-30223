package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.lang.model.element.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public abstract class Reptile extends Animals {
	public Reptile(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	Boolean laysEggs;

	public Boolean getLaysEggs() {
		return this.laysEggs;
	}
	public void setLaysEggs(Boolean laysEggs) {
		this.laysEggs=laysEggs;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(getLaysEggs()));
		}
	
	public void decodeFromXml( Element element) {
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent( )));
	}
}
