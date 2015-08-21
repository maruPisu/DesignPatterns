
public class Main {
	
	User thisUser;
	
	public static void main(String[] args){

		User thisUser = GetUser();
		
		String ret = "Firstname: " 		+ thisUser.getFirstName()
					+ "\nLastname: " 	+ thisUser.getLastName()
					+ "\nAge: " 		+ thisUser.getAge()
					+ "\nPhone: " 		+ thisUser.getPhone()
					+ "\nAddress: " 	+ thisUser.getAddress();
		
		System.out.print(ret);
	}
	
	public static User GetUser() {
		return new 
				User.UserBuilder("Gino", "Scalzi")
				.age(41)
				.address("via del campo")
				.build();
	}
}