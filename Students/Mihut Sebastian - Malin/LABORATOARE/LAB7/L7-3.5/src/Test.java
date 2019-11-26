public class Test {

	public static void main(String[] args) {
		Masina masina=new Masina("Audi","Purpuriu");
		Student student=new Student("Alexiuc","Carina",masina);
		System.out.println(student.toString());
		try {
			Student copyStudent=student.clone();
			System.out.println("Am realizat o copie a stdentului: "+copyStudent.getNume()+" "+
					copyStudent.getPrenume()+" care detine "+copyStudent.getMasina().toString());
			copyStudent.getMasina().setCuloare("Alb");//Vopsim masina
			System.out.println("Am vopsit masina");
			System.out.println(copyStudent.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
