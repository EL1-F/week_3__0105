package odev3;


public class Instructor extends User {
	
	private int instructorId;
	
	public Instructor() { 
		
	}

	public Instructor(int id,int instructorId, String firstName, String lastName, String email, String password) {
		
		super(id,firstName,lastName,email,password);
		this.instructorId = instructorId;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	
	
	
	

}
