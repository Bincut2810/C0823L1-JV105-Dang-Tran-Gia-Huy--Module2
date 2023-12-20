package mvc;

public class LoginController {
    private LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }
    private boolean check(LoginModel user) {
        if ((user.getUser().equals("danghuy203"))
        &&(user.getPass().equals("namgiang2018"))){
            return true;
        }
            return false;
    }

    public void login() {
        while (true) {
            LoginModel user = view.getInfo();
            if (check(user)) {
                view.showMessage("Login successfully");
                break;
            } else {
                view.showMessage("Wrong username or password. Nhap lai deeee");
            }
        }
    }
}
