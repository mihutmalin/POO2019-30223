import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		PetHotel p=new PetHotel();
		List<Dog> dogList=new ArrayList<>();
		dogList.add(new Dog("Miranda","Beagle",4));
		dogList.add(new Dog("Rex","Husky",7));
		dogList.add(new Dog("Muriel","Maidanez",2));
		dogList.add(new Dog("Bruno","Coocker",3));
		dogList.add(new Dog("Zeus","Labrador",1));
		dogList.add(new Dog("Bella","Boxer",3));
		dogList.add(new Dog("Pepi","Maidanez",8));
		
		List<Room> roomList=new ArrayList<>();
		roomList.add(new Room(1));
		roomList.add(new Room(2));
		roomList.add(new Room(3));
		roomList.add(new Room(4));
		roomList.add(new Room(5));
		roomList.add(new Room(6));

		
		p.addDogToRoom(roomList.get(0), dogList.get(0));
		p.addDogToRoom(roomList.get(1), dogList.get(1));
		p.addDogToRoom(roomList.get(2), dogList.get(2));
		p.addDogToRoom(roomList.get(3), dogList.get(3));
		p.addDogToRoom(roomList.get(4), dogList.get(4));
		p.addDogToRoom(roomList.get(5), dogList.get(5));
		
		p.list();
		
		p.endStay(roomList.get(0), dogList.get(0));
		p.endStay(roomList.get(1), dogList.get(1));
		p.endStay(roomList.get(2), dogList.get(2));
		
		p.list();
		
		p.addDogToRoom(roomList.get(3), dogList.get(0));//il suprascrie
		
		p.list();
	}

}
