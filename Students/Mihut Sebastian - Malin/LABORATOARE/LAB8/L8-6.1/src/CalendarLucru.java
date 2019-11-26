
public class CalendarLucru {
	private Zi[] zile= {new Zi("luni",true),new Zi("marti",true),new Zi("miercuri",true),
			new Zi("joi",true),new Zi("vineri",true),new Zi("sambata",false),new Zi("duminica",false)};
	
	public void setZi(Zi zi,int i) {
		this.zile[i]=zi;
	}
	public Zi getZi(int i) {
		return this.zile[i];
	}
}
