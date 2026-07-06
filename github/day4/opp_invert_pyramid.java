package day4;

public class opp_invert_pyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <n; i++) {
            for (int j = n; j >n-i; j--) {
                System.out.print(" ");
            }
            for (int k = n-1; k>= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
