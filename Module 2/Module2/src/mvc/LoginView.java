package mvc;

import java.util.Scanner;

public class LoginView {
    public static Scanner scanner = new Scanner(System.in);

    public void showMessage(String msg) {
        System.out.println(msg);

    }
    public LoginModel getInfo() {
        System.out.println("----LOGIN----");
        System.out.println();

        LoginModel user = new LoginModel();
        System.out.println("Username: ");
        user.setUser(scanner.next());
        System.out.println("Password: ");
        user.setPass(scanner.next());
        return user;
    }
}
