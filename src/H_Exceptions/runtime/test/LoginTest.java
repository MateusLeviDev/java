package H_Exceptions.runtime.test;

import H_Exceptions.domain.LoginInvalidException;

import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) throws LoginInvalidException {
        login();
    }
//co
    private static void login() throws LoginInvalidException {
        Scanner scanner = new Scanner(System.in);
        String name = "Levi";
        String password = "123";
        System.out.println("------- USER:");
        String chosenName = scanner.nextLine();
        System.out.println("------- PASSWORD:");
        String chosenPassword = scanner.nextLine();
        if (!chosenName.equalsIgnoreCase(name) | !chosenPassword.equalsIgnoreCase(password)) {
            throw new LoginInvalidException("User or password invalid");
        }
        System.out.println("Concluded");
    }
}
