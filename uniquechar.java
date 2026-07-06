package day9;
import java.util.Scanner;
public class typesoftriangle {



    public static String triangleType(int[] nums) {

        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        if (a + b <= c || b + c <= a || a + c <= b) {
            return "none";
        }
        else if (a == b && b == c) {
            return "equilateral";
        }
        else if (a == b || b == c || c == a) {
            return "isosceles";
        }
        else {
            return "scalene";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[3];

        System.out.println("Enter the three sides:");

        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }

        String result = triangleType(nums);

        System.out.println("Triangle Type: " + result);


    }
}