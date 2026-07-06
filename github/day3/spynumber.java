package day3;

import java.util.Scanner;

public class spynumber {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the integer:");
            int n = sc.nextInt();
            int sum = 0;
            int product = 1;

            while(n!=0){
                int a = n%10;
                n = n/10;
                sum += a;
                product *= a;

            }
            if(sum==product){
                System.out.println("the given is a spy number");
            }
            else{
                System.out.println("the given is not a spy number");
            }
        }

}
