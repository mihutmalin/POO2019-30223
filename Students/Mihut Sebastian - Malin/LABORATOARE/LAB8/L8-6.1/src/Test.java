
public class Test {

	public static void main(String[] args) {
		Lucrator lucratori[]=new Lucrator[10];
		CalendarLucru calendar1=new CalendarLucru();
		CalendarLucru calendar2=new CalendarLucru();
		calendar2.setZi(new Zi("luni",false), 0);
		lucratori[0]=new Lucrator("Denis",calendar1);
		lucratori[1]=new Lucrator("Diana",calendar2);
		
		try {
			lucratori[0].lucreaza("luni");
			lucratori[0].lucreaza("marti");
			lucratori[0].lucreaza("sambata");
		} catch (ExceptionZiLucratoare e) {
			e.printStackTrace();
		}
		try {
			lucratori[1].lucreaza("marte");
			lucratori[1].lucreaza("miercuri");
			lucratori[1].lucreaza("sambata");
		} catch (ExceptionZiLucratoare e) {
			e.printStackTrace();
		}
	}
}
