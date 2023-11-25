package Array;

import java.util.Scanner;

public class ElementAdding {
    public static void main(String[] args) {
        System.out.println("Enter number of element in array");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number you want to add");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter index you want to add");
        int index = Integer.parseInt(scanner.nextLine());

        int[] x = new int[n];
        int[] y = new int[n+1];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter array at index: " + i);
            x[i] = Integer.parseInt(scanner.nextLine());
        }

        int count = 0;
        for (int i = 0; i < y.length; i++) {
            if (i == index) {
                y[index] = num;
            } else {
                y[i] = x[count];
                count++;
            }
        }
        for (int i = 0; i < y.length; i++) {
            System.out.println(i);
        }
    }
}
