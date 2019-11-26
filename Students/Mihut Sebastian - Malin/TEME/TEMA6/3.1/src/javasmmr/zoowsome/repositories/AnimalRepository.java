package javasmmr.zoowsome.repositories;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.XMLEventFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartDocument;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Chameleon;
import javasmmr.zoowsome.models.animals.Chicken;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Duck;
import javasmmr.zoowsome.models.animals.Fish;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Turtle;
import javasmmr.zoowsome.models.animals.Whale;
import javasmmr.zoowsome.services.factories.Constants;

enum e { saltwater,freshwater; } 
public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";
	public AnimalRepository() {
	}
	public void save(ArrayList <Animals > animals) throws FileNotFoundException, XMLStreamException {
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance() ;
		// Create XMLEvent Writer
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter (new FileOutputStream(XML_FILENAME));
		// Create a EventFactory
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n ");
		// Create and write Start Tag
		StartDocument startDocument = eventFactory.createStartDocument( );
		eventWriter.add(startDocument);
		// Create content open tag
		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		for (Animals animal : animals) {
			StartElement sElement = eventFactory.createStartElement ("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(sElement);
			eventWriter.add(end);
			animal.encodeToXml (eventWriter);
			EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(eElement);
			eventWriter.add(end);
		}
		eventWriter.add(eventFactory.createEndElement("", "", " content"));
		eventWriter.add(eventFactory.createEndDocument() );
		eventWriter.close( );
		}

	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		// Create Start node
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		// Create Content
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		// Create End node
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}

	public ArrayList<Animals> load() throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Animals> animals = new ArrayList<Animals>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
			for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant =
				(element).getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
				.getTextContent();
					switch (discriminant) {
					
					case Constants.Animals.Insects.Butterfly:
						Animals butterfly = new Butterfly(0.2,0.1);
						butterfly.decodeFromXml(element);
						animals.add(butterfly);
					case Constants.Animals.Insects.Spider:
						Animals spider = new Spider(0.7,0.6);
						spider.decodeFromXml(element);
						animals.add(spider);
					case Constants.Animals.Insects.Cockroach:
						Animals cockroach = new Cockroach(0.5,0.1);
						cockroach.decodeFromXml(element);
						animals.add(cockroach);
						
					case Constants.Animals.Mammals.Cow:
						Animals cow = new Cow(2.3,0.4);
						cow.decodeFromXml(element);
						animals.add(cow);
					case Constants.Animals.Mammals.Monkey:
						Animals monkey = new Monkey(4.5,0.3);
						monkey.decodeFromXml(element);
						animals.add(monkey);	
					case Constants.Animals.Mammals.Tiger:
						Animals tiger = new Tiger(7.8,0.9);
						tiger.decodeFromXml(element);
						animals.add(tiger);
						
					case Constants.Animals.Reptiles.Chameleon:
						Animals chameleon = new Chameleon(2.1,0.2);
						chameleon.decodeFromXml(element);
						animals.add(chameleon);
					case Constants.Animals.Reptiles.Snake:
						Animals snake = new Snake(3.3,0.8);
						snake.decodeFromXml(element);
						animals.add(snake);	
					case Constants.Animals.Reptiles.Turtle:
						Animals turtle = new Turtle(4.9,0.1);
						turtle.decodeFromXml(element);
						animals.add(turtle);
						
					case Constants.Animals.Birds.Parrot:
						Animals parrot = new Parrot(1.0,0.1);
						parrot.decodeFromXml(element);
						animals.add(parrot);
					case Constants.Animals.Birds.Duck:
						Animals duck = new Duck(2.5,0.2);
						duck.decodeFromXml(element);
						animals.add(duck);	
					case Constants.Animals.Birds.Chicken:
						Animals chicken = new Chicken(1.5,0.1);
						chicken.decodeFromXml(element);
						animals.add(chicken);
						
					case Constants.Animals.Aquatics.Whale:
						Animals whale = new Whale(7.0,0.5);
						whale.decodeFromXml(element);
						animals.add(whale);
					case Constants.Animals.Aquatics.Fish:
						Animals fish = new Fish(0.5,0.1);
						fish.decodeFromXml(element);
						animals.add(fish);	
					case Constants.Animals.Aquatics.Shark:
						Animals shark = new Shark(4.0,1.0);
						shark.decodeFromXml(element);
						animals.add(shark);
					default:
					break;
					}
				}
			}
			return animals;
	}
	
}
