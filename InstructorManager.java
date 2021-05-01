package odev3_2;

public class InstructorManager extends UserManager{
	
	public void register(Instructor instructor) {
		System.out.println("Sisteme " + instructor.getFirstName() + " adl� e�itimci " + instructor.getBranch() + " dal�nda eklendi.");
	}
	public void delete (Instructor instructor) {
		System.out.println("Sistemden " + instructor.getFirstName() + " silindi.");
	}
	
	public void update(Instructor instructor, Instructor oldInstructor) {
		instructor = oldInstructor;
		System.out.println("Sistemde " + instructor.getFirstName() + " bilgileri g�ncelledi.");
	}
	
	public void studentListe(Student[] students) {
		for(Student st : students) {
			System.out.println(st.getFirstName() + " isimli ��renci " + st.getLesson() + " dersine kat�lacak.");
		}
	}
	public void studentInspection(Student[] students) {
		
		System.out.println("Yoklama al�d� s�n�fta olan ��renciler :");
		
		for (Student st : students) {
			System.out.println(st.getFirstName());
		}
	}
	
	

}
