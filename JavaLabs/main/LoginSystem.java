package main;
import user.UserManager;
import java.io.Console;
public class LoginSystem{

	public static void main(String args[]){

		Console console=System.console();
		System.out.print("Enter username: ");
		String user = console.readLine();

		System.out.print("Enter Password: ");
		char[] pass= console.readPassword();

		String p= String.valueOf(pass);

		if(UserManager.LoginProcessor.authenticate(user,p)==true){

			System.out.println("VALID USERNAME AND PASSWORD. ACCESS GRANTED");

		}else{

			System.out.println("Invalid. access denied");

		}
		




	}




}