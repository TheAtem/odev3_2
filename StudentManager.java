package odev3_2;

public class StudentManager extends UserManager{
	
	public void register(Student student) {
		System.out.println(student.getLesson() + " sınıfına " + student.getFirstName() + "  eklendi.");
	}
	public void delete (Student student) {
		System.out.println(student.getLesson() + " dersinden " + student.getFirstName() + " silindi.");
	}
	
	public void update(Student oldStudent, Student newStudent) {
		newStudent=oldStudent;
		System.out.println("Öğrenci " + newStudent.getFirstName() + " bilgileri güncelledi.");
	}
	
	public void lesson(Student student) {
		System.out.println(student.getLesson() + " dersine katılım sağlandı.");
		student.setInspection(true);
	}
	
	public void homeWork(Student student) {
		System.out.println(student.getFirstName() + " ev ödevi yapıldı.");
	}
}
