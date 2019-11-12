import java.util.Random;

public class TestGhiozdan {
	public static void main(String[] args) {
		Ghiozdan ghiozdan=new Ghiozdan();
		Random rand=new Random();
		for(int i=0;i<rand.nextInt(10);i++) {
			ghiozdan.addCaiet();
		}
		
		for(int i=0;i<rand.nextInt(10);i++) {
			ghiozdan.addManual();
		}
	
		System.out.println("In ghiozdan avem "+ghiozdan.getNrRechizite()+" rechizite");
		System.out.println("In ghiozdan avem "+ghiozdan.getNrManuale()+" manuale");
		System.out.println("In ghiozdan avem "+ghiozdan.getNrCaiete()+" caiete");
		ghiozdan.listItems();
		ghiozdan.listManual();
		ghiozdan.listCaiet();
	}

}
