package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
public abstract class Insect extends Animals {
	public Insect(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	Boolean canFly;
	Boolean isDangerous;
	
	public Boolean getCanFly() {
		return this.canFly;
	}
	public void setCanFly(Boolean canFly) {
		this.canFly=canFly;
	}
	
	public Boolean getIsDangerous() {
		return this.canFly;
	}
	public void setIsDangerous(Boolean isDangerous) {
		this.isDangerous=isDangerous;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(getCanFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerous()));
		}
	
	public void decodeFromXml( Element element) {
		setCanFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent( )));
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
		}
}
