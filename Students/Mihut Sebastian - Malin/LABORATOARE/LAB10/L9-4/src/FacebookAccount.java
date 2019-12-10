import java.util.ArrayList;
import java.util.List;

public class FacebookAccount {
	private String nume;
	private int varsta;
	private String locatie;
	private List<FacebookAccount> list;
	
	public FacebookAccount(String nume,int varsta,String locatie) {
		this.nume=nume;
		this.varsta=varsta;
		this.locatie=locatie;
		this.list=new ArrayList<>();
	}
	
	public void addFriend(FacebookAccount f) {
		list.add(f);
	}
	
	public void deleteFriend(FacebookAccount f) {
		list.remove(f);
	}
	
	private void showFreind() {
		System.out.println(this.nume+", "+this.varsta+", "+this.locatie);
	}
	
	private void showFreindWithoutLocation() {
		System.out.println(this.nume+", "+this.varsta);
	}
	
	public void listFriends() {
		System.out.println("Your friends are:");
		for(FacebookAccount f:list) {
			f.showFreind();
		}
		System.out.println();
	}
	
	public void searchByLocation(String l) {
		System.out.println("Your freinds from "+l+" are:");
		for(FacebookAccount f:this.list) {
			if(f.locatie.equals(l)) {
				f.showFreindWithoutLocation();
			}
		}
		System.out.println();
	}
}
