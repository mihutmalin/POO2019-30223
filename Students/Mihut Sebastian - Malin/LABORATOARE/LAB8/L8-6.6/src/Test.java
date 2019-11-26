
public class Test {

	public void f() throws MyException1 {
		throw new MyException1();
	}
	
	public void g() throws MyException2 {
		try {
			this.f();
		}
		catch(MyException1 e) {
			throw new MyException2();
		}
	}
	
	public static void main(String[] args) throws MyException1, MyException2 {
		Test t=new Test();
		try {
			t.f();
		}
		catch(MyException1 e) {
		}
		try {
			t.g();
		}
		catch(MyException2 e) {
		}
		t.f();
		t.g();
	}

}
