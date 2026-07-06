package day3;

import java.util.Scanner;

public class neonnumber {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the integer:");
            int n = sc.nextInt();
            int sum = 0;
            int sq = n*n;

            while(sq!=0){
                int a = sq%10;
                sq = sq/10;
                sum += a;
            }
            if (sum==n)
            {
                System.out.println("the given integer is a neon number");
            }
            else {
                System.out.println("the given is not a neon number");
            }

        }

}
