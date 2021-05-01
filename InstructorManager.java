package odev3_2;

public class InstructorManager extends UserManager{
	
	public void register(Instructor instructor) {
		System.out.println("Sisteme " + instructor.getFirstName() + " adlý eðitimci " + instructor.getBranch() + " dalýnda eklendi.");
	}
	public void delete (Instructor instructor) {
		System.out.println("Sistemden " + instructor.getFirstName() + " silindi.");
	}
	
	public void update(Instructor instructor, Instructor oldInstructor) {
		instructor = oldInstructor;
		System.out.println("Sistemde " + instructor.getFirstName() + " bilgileri güncelledi.");
	}
	
	public void studentListe(Student[] students) {
		for(Student st : students) {
			System.out.println(st.getFirstName() + " isimli öðrenci " + st.getLesson() + " dersine katýlacak.");
		}
	}
	public void studentInspection(Student[] students) {
		
		System.out.println("Yoklama alýdý sýnýfta olan öðrenciler :");
		
		for (Student st : students) {
			System.out.println(st.getFirstName());
		}
	}
	
	

}
