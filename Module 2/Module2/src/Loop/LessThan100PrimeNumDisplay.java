package Loop;

public class LessThan100PrimeNumDisplay {
    public static void main(String[] args) {
        int nums = 25;
        int count = 0;
        int N = 2;

        System.out.println("Less than 100 prime numbers list:" );

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


