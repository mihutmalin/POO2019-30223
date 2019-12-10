import java.util.HashMap;
import java.util.Map;

public class PetHotel {
	private int nrRooms=5;
	private Map<Room,Dog> m;
	
	PetHotel(){
		this.m=new HashMap<>();
	}
	
	public void addDogToRoom(Room r,Dog d) {
		if(this.nrRooms>0) {
			this.m.put(r,d);
			this.nrRooms--;
		}
		else {
			System.out.print("Nu exista vreo camera disponibila pentru a caza acest caine: ");
			d.listDog();
			System.out.println();
			System.out.println();
		}
	}
	
	public void endStay(Room r,Dog d) {
		this.m.remove(r,d);
		this.nrRooms++;
	}
	
	public void list() {
		for(Map.Entry<Room,Dog> pereche:this.m.entrySet()) {
			pereche.getValue().listDog();
			System.out.print(" --- ");
			pereche.getKey().listRoom();
			System.out.println();
		}
		System.out.println();
	}
	
}
