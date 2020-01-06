package javasmmr.zoowsome;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.repositories.AnimalRepository;

public class Information {
		private static ArrayList<Animals> lista=new ArrayList<>();
		private static AnimalRepository animalRepository=new AnimalRepository();
		
		public void add1(Animals a) {
			getLista().add(a);
		}
		
		public void saveInXML( ArrayList<Animals> listaMea) {
			
			try {
				getAnimalRepository().save(listaMea);
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (XMLStreamException e) {
				e.printStackTrace();
			}
		}
		
		public static ArrayList<Animals> getLista() {
			return lista;
		}

		public static void setLista(ArrayList<Animals> lista) {
			Information.lista = lista;
		}

		public static AnimalRepository getAnimalRepository() {
			return animalRepository;
		}

		public static void setAnimalRepository(AnimalRepository animalRepository) {
			Information.animalRepository = animalRepository;
		}
}
