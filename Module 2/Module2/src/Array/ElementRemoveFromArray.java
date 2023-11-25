package Array;

import java.util.Scanner;

public class ElementRemoveFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = {2,4,6,8,10};
        System.out.println("Enter element you want to delete:");
        int x = Integer.parseInt(scanner.nextLine());
        if (x < 0 || x > nums.length)
        {
            System.out.println("please enter number in array");
            return;
        }
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (x==i) {
                flag = true;
            }
            if (flag) {
                nums[i] = nums[i+1];
            }
        }



    }
}
