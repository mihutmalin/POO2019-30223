package javasmmr.zoowsome.repositories;
import org.w3c.dom.Element;
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
public class AnimalRepository  extends EntityRepository<Animals>  {
	private static final String XML_FILENAME = "Animals.xml";
	
	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}

	@Override
	protected Animals getEntityFromXmlElement(Element element) {
		String discriminant =element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Animals.Insects.Butterfly:
			Animals butterfly = new Butterfly(0.2,0.1);
			butterfly.decodeFromXml(element);
			return butterfly;
		case Constants.Animals.Insects.Spider:
			Animals spider = new Spider(0.7,0.6);
			spider.decodeFromXml(element);
			return spider;
		case Constants.Animals.Insects.Cockroach:
			Animals cockroach = new Cockroach(0.5,0.1);
			cockroach.decodeFromXml(element);
			return cockroach;
			
		case Constants.Animals.Mammals.Cow:
			Animals cow = new Cow(2.3,0.4);
			cow.decodeFromXml(element);
			return cow;
		case Constants.Animals.Mammals.Monkey:
			Animals monkey = new Monkey(4.5,0.3);
			monkey.decodeFromXml(element);
			return monkey;
		case Constants.Animals.Mammals.Tiger:
			Animals tiger = new Tiger(7.8,0.9);
			tiger.decodeFromXml(element);
			return tiger;
			
		case Constants.Animals.Reptiles.Chameleon:
			Animals chameleon = new Chameleon(2.1,0.2);
			chameleon.decodeFromXml(element);
			return chameleon;
		case Constants.Animals.Reptiles.Snake:
			Animals snake = new Snake(3.3,0.8);
			snake.decodeFromXml(element);
			return snake;	
		case Constants.Animals.Reptiles.Turtle:
			Animals turtle = new Turtle(4.9,0.1);
			turtle.decodeFromXml(element);
			return turtle;
			
		case Constants.Animals.Birds.Parrot:
			Animals parrot = new Parrot(1.0,0.1);
			parrot.decodeFromXml(element);
			return parrot;
		case Constants.Animals.Birds.Duck:
			Animals duck = new Duck(2.5,0.2);
			duck.decodeFromXml(element);
			return duck;	
		case Constants.Animals.Birds.Chicken:
			Animals chicken = new Chicken(1.5,0.1);
			chicken.decodeFromXml(element);
			return chicken;
			
		case Constants.Animals.Aquatics.Whale:
			Animals whale = new Whale(7.0,0.5);
			whale.decodeFromXml(element);
			return whale;
		case Constants.Animals.Aquatics.Fish:
			Animals fish = new Fish(0.5,0.1);
			fish.decodeFromXml(element);
			return fish;
		case Constants.Animals.Aquatics.Shark:
			Animals shark = new Shark(4.0,1.0);
			shark.decodeFromXml(element);
			return shark;
		default:
			break;
		}
		return null;
	}
}
