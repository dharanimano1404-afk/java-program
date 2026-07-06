package day9;
import java.util.Scanner;
public class categoriesbox {
    public static String categorizeBox(int length, int width, int height, int mass) {

        long volume = 1L * length * width * height;

        boolean bulky = (length >= 10000 ||
                width >= 10000 ||
                height >= 10000 ||
                volume >= 1000000000L);

        boolean heavy = (mass >= 100);

        if (bulky && heavy)
            return "Both";
        else if (bulky)
            return "Bulky";
        else if (heavy)
            return "Heavy";
        else
            return "Neither";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter width: ");
        int width = sc.nextInt();

        System.out.print("Enter height: ");
        int height = sc.nextInt();

        System.out.print("Enter mass: ");
        int mass = sc.nextInt();

        String result = categorizeBox(length, width, height, mass);

        System.out.println("Category: " + result);

        sc.close();
    }
}
