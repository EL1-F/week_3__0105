package odev3;

public class Main {

	public static void main(String[] args) {
		Student student1= new Student();
		student1.setId(1);
		student1.setStudentId(1);
		student1.setFirstName("Elif");
		student1.setLastName("Coskuner");
		student1.setEmail("elif@gmail.com");
		student1.setPassword("123456");
		
		StudentManager studentManager= new StudentManager();
		studentManager.register(student1);
		studentManager.joinCourse(student1, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		System.out.println("--------------------------");
		
		Student student2 = new Student(2,2,"Tarik","Yildirmis","tarik@gmail.com","1111111");
		studentManager.register(student2);
		studentManager.joinCourse(student2, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		System.out.println("--------------------------");
		
		Instructor instructor= new Instructor(3,1,"Engin","Demirog","enginDemirog@gmail.com","123123");
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.register(instructor);
		instructorManager.addCourse("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");

	}

}
