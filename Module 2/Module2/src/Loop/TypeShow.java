package Loop;

import java.util.Scanner;

public class TypeShow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;

        do {
            System.out.println("Chon chuc nang: 1 den 4\n" +
                    "1.Print the rectangle\n" +
                    "2.Print the square triangle\n" +
                    "3.Print isosceles triangle\n" +
                    "4.Exit");
            int chon = scanner.nextInt();
            switch (chon)
            {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 0; i <= 3; i++) {
                        for (int j = 0; j <= 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    for (int i = 1; i <=5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int i = 7; i >=1 ; i--) {
                        for (int j = 1; j <=i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    cont = false;
                    break;
                default:
                    System.out.println("tam biet");
                    break;

            }
        }   while (cont);
        System.out.println("this is the end");
    }
}
