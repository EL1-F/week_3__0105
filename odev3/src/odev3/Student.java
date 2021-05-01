package odev3;


public class Student extends User{
	
	private int studentId;
	
	public Student() {
		
	}

	public Student(int id,int studentId, String firstName, String lastName, String email, String password) {
		
		super(id,firstName,lastName,email,password);
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	

}
