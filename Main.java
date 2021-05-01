package odev3_2;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Hakan", "YILMAZ", "abc@gmail.com", 30);
		User user2 = new User(2, "Volkan", "YILMAZ", "def@gmail.com", 31);
		User user3 = new User(3, "Serkan", "YILMAZ", "ghj@gmail.com", 26);
		User user4 = new User(4, "Mehmet Can", "YILMAZ", "ılm@gmail.com", 24);
		
		UserManager userManager = new UserManager();
		
		userManager.register(user1);
		userManager.register(user2);
		userManager.register(user3);
		userManager.register(user4);
		
		System.out.println("================================================");
		
		Student student1 = new Student(1, "Hakan", "YILMAZ", "abc@gmail.com", 30, "Java");
		Student student2 = new Student(2, "Volkan", "YILMAZ", "def@gmail.com", 31, "java");
		Student student3 = new Student(3, "Serkan", "YILMAZ", "ghj@gmail.com", 26, "Java");
		Student student4 = new Student(4, "Mehmet Can", "YILMAZ", "ılm@gmail.com", 24, "java");
		
		
		Instructor hoca = new Instructor(1, "Mehmet", "Syoadıgüzel", "mehmet@gmail.com", 40, "Yazılım");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.register(hoca);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.register(student1);
		studentManager.register(student2);
		studentManager.register(student3);
		studentManager.register(student4);
		
		Student[] students = {student1, student2, student3, student4};
	
		for(Student st : students) {
			st.setInspection(true);
		}
		
		instructorManager.studentListe(students);
		instructorManager.studentInspection(students);
		
		
		
	}

}
