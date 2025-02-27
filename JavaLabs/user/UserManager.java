package user;
import util.PasswordValidator;
public class UserManager{

	static final String storedUsername = "Skibidi";
	static final String storedPassword = "Cat";


	public static class LoginProcessor{

		public static boolean authenticate(String username, String password){

			if(username.equals(storedUsername) && password.equals(storedPassword)){

					return true;

				}
                     else {
			return false;}
		}


	}




}