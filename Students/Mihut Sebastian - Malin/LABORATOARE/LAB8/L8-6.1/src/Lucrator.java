
public class Lucrator {
	private String nume;
	private CalendarLucru calendar;
	
	Lucrator(String nume,CalendarLucru calendar){
		this.nume=nume;
		this.calendar=calendar;
	}
	
	public void lucreaza(String zi) throws ExceptionZiLucratoare{
		Zi z=null;
		for(int i=0;i<7;i++) {
			if(this.calendar.getZi(i).getNume().equals(zi)) {
				z=this.calendar.getZi(i);
				break;
			}
		}
		if(z==null) {
			System.out.println(zi+" nu este o zi a saptamanii");
		}
		if(z.esteLucratoare==true) {
			System.out.println("Ziua introdusa este o zi lucratoare");
		}
		else
			throw new ExceptionZiLucratoare("Ziua introdusa nu este o zi lucratoare");
	}
}
