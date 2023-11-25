import java.util.Scanner;

public class NumberReading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scanner.nextInt();
        int n1 = num;
        int n2 = num;
        int b=n1%10;
        int a=n2/10;
        if (num < 0 || num > 999) {
            System.out.println("out of ability");
        }
        else if (num == 0) {
            System.out.println("Zero");
        }
        String[] single_num = new String[] {"zero","one","two","three","four","five","six"};

        }
    }

