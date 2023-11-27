package Array;

import java.util.Scanner;

public class TwoDimensionalLargestElementFinding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rows: ");
        int numRows = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter column: ");
        int numCols = Integer.parseInt(scanner.nextLine());

        double [] [] matrix = new double[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.println("Enter value at [" + i + "][" + j + "]: ");
                matrix[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }

        double maxElement = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] > maxElement){
                    maxElement = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Largest element of matrix is: " + maxElement);
        System.out.println("Coordinates of largest element is:[" + maxRow + "] [" + maxCol + "] ");
        scanner.close();
    }
}
