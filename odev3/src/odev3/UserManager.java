package odev3;

public class UserManager {
	
	public void login(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " Sisteme giris yaptiniz.");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " Sistemden cikis yaptiniz.");
	}
	
	public void register(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " Kaydiniz olusturuldu.");
	}
	
	public void multiRegister(User[] users) {
		
		for(User user:users) {
			System.out.println(user.getFirstName()+" "+user.getLastName()+ " Kaydiniz olusturuldu.");
		}
		
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " Kaydiniz silindi.");
	}
	
	public void updtae(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " Kaydiniz güncellendi.");
	}


}
