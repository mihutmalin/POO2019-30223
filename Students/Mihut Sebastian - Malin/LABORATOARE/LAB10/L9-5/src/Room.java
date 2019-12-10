
public class Room{
	private int nrRoom;
	
	Room(int nrRoom){
		this.nrRoom=nrRoom;
	}
	
	public void listRoom() {
		System.out.print("camera "+this.nrRoom);
	}

	public boolean equals(Object o) {
		if(this.nrRoom==((Room)o).nrRoom) {
			return true;
		}
		return false;
	}
}
