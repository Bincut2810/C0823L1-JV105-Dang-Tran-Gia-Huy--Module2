package Array;

import java.util.Scanner;

public class SmallestValueInArrayFinding {
    public static void main(String[] args) {
        final int SIZE = 5;
        int[] array = new int[SIZE];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for all element in array");

        for (int i = 0; i < SIZE; i++) {
            System.out.println("Enter value at index" + (i+1)+": ");
            array[i] = Integer.parseInt(sc.nextLine());
        }

        int minValue = array[0];

        for (int i = 0; i < SIZE; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("Smallest element in array is" + minValue);

        sc.close();
    }
}
