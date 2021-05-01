package odev3_2;

public class UserManager {

	
	public void register(User user) {
		System.out.println("Sisteme " + user.getFirstName() + "  eklendi.");
	}
	public void delete (User user) {
		System.out.println("Sistemden " + user.getFirstName() + " silindi.");
	}
	
	public void update(User newUser, User oldUser) {
		newUser = oldUser;
		System.out.println("Sistemde " + newUser.getFirstName() + " bilgileri güncelledi.");
	}

}
