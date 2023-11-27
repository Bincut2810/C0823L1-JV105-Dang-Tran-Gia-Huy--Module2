package Array;

import java.util.Scanner;

public class ArrayMerging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.println("Enter size of array 2");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Enter value of array1");
        for (int i = 0; i < size1; i++) {
            System.out.println("Element" + i+1 +":");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter value of array2");
        for (int i = 0; i < size2; i++) {
            System.out.println("Element" + i+1 +":");
            array2[i] = scanner.nextInt();
        }

        int size3 = size1 + size2;
        int[] array3 = new int[size3];

        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            array3[i] = array2[i];
        }

        System.out.println("Array 3 after merging :");
        for (int i = 0; i < size3; i++) {
            System.out.println(array3[i] + "");
        }
    }
}
