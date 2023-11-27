package Array;

import java.util.Scanner;

public class ColumnSumCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("Enter columns: ");
        int cols = Integer.parseInt(sc.nextLine());
         double[][] array = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter value of array[" + i + "] [" + j + "]");
                array[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        System.out.println("Enter col you want to Sum: ");
        int columnIndex = Integer.parseInt(sc.nextLine());

        double sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += array[i][columnIndex];
        }
        System.out.println("Sum of column" + columnIndex + "is : " + sum);
        sc.close();
    }
}
