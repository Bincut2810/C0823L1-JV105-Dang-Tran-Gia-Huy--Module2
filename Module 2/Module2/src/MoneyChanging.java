import java.util.Scanner;

public class MoneyChanging {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter USD");
        usd = scanner.nextDouble();
        double changing = usd * 23000;
        System.out.println("VND Value: " + changing);
    }
}
