
public class Test {

	public static void main(String[] args) {
		FacebookAccount f=new FacebookAccount("DeniS Zoican",20,"Cluj-Napoca");
		
		f.addFriend(new FacebookAccount("Trifu Diana",20,"Cluj-Napoca"));
		f.addFriend(new FacebookAccount("Moriczi Sandor",20,"Cluj-Napoca"));
		f.addFriend(new FacebookAccount("Gregory Vien",27,"Minessota"));
		FacebookAccount a=new FacebookAccount("Habdul Abulatul",45,"Bombay");
		f.addFriend(a);
		
		f.listFriends();
		
		f.searchByLocation("Cluj-Napoca");
		
		f.deleteFriend(a);
		
		f.listFriends();
		
	}

}
