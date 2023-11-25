package Loop;

import java.util.Scanner;

public class First20PrimeNumbersDisplay {
    public static void main(String[] args) {
        int nums = 20;
        int count = 0;
        int N = 2;

        System.out.println("Danh sách 20 số nguyên tố đầu tiên");

        while (count < nums){
            if (checkNum(N)){
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }

    static boolean checkNum(int n){
        if (n <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
}
