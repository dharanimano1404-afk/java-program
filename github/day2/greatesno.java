package day2;
import java.util.Scanner;
public class greatesno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three  numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b | c>b) {
            if (a > c) {
                System.out.println(a + " is greater");
            } else
                System.out.println(c + " is greater");
        } else {
            System.out.println(b + " is greater");
        }
    }
}