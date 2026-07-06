package day3;

import java.util.Scanner;

public class strongnumber {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the integer:");
            int n = sc.nextInt();
            int original = n;

            int sum = 0;

            while(n!=0){
                int a = n%10;
                n = n/10;
                int fact = 1;
                for(int i=1;i<=a;i++){
                    fact *= i;
                }
                sum += fact;
            }
            if(sum == original){
                System.out.println("the given is a strong number:");
            }
            else{
                System.out.println("the given is not a strong number");
            }
        }

}
