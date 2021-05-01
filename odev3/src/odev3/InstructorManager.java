package odev3;

public class InstructorManager extends UserManager{

	@Override
	public void register(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " Egitmen kaydiniz olusturuldu.");
	}
	
	public void addCourse (String kurs) {
		System.out.println(kurs+"....Kurs Eklendi");
	}
	
	public void deleteCourse (String kurs) {
		System.out.println(kurs+"....Kurs Silindi");
	}
	
}
