package odev3_2;

public class StudentManager extends UserManager{
	
	public void register(Student student) {
		System.out.println(student.getLesson() + " s�n�f�na " + student.getFirstName() + "  eklendi.");
	}
	public void delete (Student student) {
		System.out.println(student.getLesson() + " dersinden " + student.getFirstName() + " silindi.");
	}
	
	public void update(Student oldStudent, Student newStudent) {
		newStudent=oldStudent;
		System.out.println("��renci " + newStudent.getFirstName() + " bilgileri g�ncelledi.");
	}
	
	public void lesson(Student student) {
		System.out.println(student.getLesson() + " dersine kat�l�m sa�land�.");
		student.setInspection(true);
	}
	
	public void homeWork(Student student) {
		System.out.println(student.getFirstName() + " ev �devi yap�ld�.");
	}
}
