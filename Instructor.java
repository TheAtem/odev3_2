package odev3_2;

public class Instructor extends User{

	private String branch;

	public Instructor(int id, String firstName, String lastName, String email, int age, String branch) {
		super(id, firstName, lastName, email, age);
		this.branch = branch;
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
	public String getBranch() {
		return this.branch;
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

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
