package odev3;


public class StudentManager extends UserManager{

	public void joinCourse(User user, String kurs) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+", "+
	kurs+" adli egitime kaydiniz alinmistir" );
	}
	
	
	public void leftCourse (User user,String kurs) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+", "+
				kurs+" adli egitimden kaydiniz silinmistir" );
	}

}
