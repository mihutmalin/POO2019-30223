
public class Test {
	private Integer a[]=new Integer[10];
	public static void main(String[] args) {
		Test t=new Test();
		for(int i=0;i<t.a.length;i++)
			t.a[i]=i;
		
		try {
			System.out.println(t.a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
		}
		
		System.out.println(t.a[10]);

	}

}
