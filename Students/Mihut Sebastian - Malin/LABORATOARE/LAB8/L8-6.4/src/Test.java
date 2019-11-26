
public class Test {

	public static void main(String[] args) {
		try{
			Exception e=new Exception("EXCEPTION!");
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("S-a ajuns aici");
		}

	}

}
