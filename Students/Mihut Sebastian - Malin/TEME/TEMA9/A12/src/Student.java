import java.util.ArrayList;
import java.util.List;

public class Student {
	 private String name;
	 private double avgGrade;
	 private List<String> courses;
	 
	 public Student(String name, double avgGrade) {
		 this.setName(name);
		 this.avgGrade=avgGrade;
		 this.courses=new ArrayList<String>();
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
}
