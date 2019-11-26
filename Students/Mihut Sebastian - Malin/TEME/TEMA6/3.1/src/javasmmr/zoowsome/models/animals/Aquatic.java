package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

enum e { saltwater,freshwater; } 

public abstract class Aquatic extends Animals {
	public Aquatic(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	Integer avgSwimDepth;
	e waterType;

	public Integer getAvgSwimDepth() {
		return this.avgSwimDepth;
	}
	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth=avgSwimDepth;
	}
	
	public e getWaterType() {
		return this.waterType;
	}
	public void setWaterType(e waterType) {
		this.waterType=waterType;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));
		createNode(eventWriter, "waterType", String.valueOf(getWaterType()));
		}
	
	public void decodeFromXml( Element element) {
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent( )));
		setWaterType(e.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
		}
}
