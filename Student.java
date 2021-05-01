package odev3_2;

public class Student extends User{

	private String lesson;
	private boolean inspection;

	
	public Student(int id, String firstName, String lastName, String email, int age, String lesson) {
		super(id, firstName, lastName, email, age);
		this.lesson = lesson;
	}
	
	public int getId() {
		return super.getAge();
	}

	public String getFirstName() {
		return super.getFirstName();
	}

	public String getLastName() {
		return super.getLastName();
	}

	public String getEmail() {
		return super.getEmail();
	}

	public int getAge() {
		return super.getAge();
	}
	public String getLesson() {
		return this.lesson;
	}
	public boolean getInspection() {
		return this.inspection;
	}
	
	public void setId(int id) {
		super.setId(id);
	}

	public void setFirstName(String firstName) {
		super.setFirstName(firstName);
	}

	public void setLastName(String lastName) {
		super.setLastName(lastName);
	}

	public void setEmail(String email) {
		super.setEmail(email);
	}

	public void setAge(int age) {
		super.setAge(age);
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	public void setInspection(boolean inspection) {
		this.inspection = inspection;
	}
	
	
	
}
