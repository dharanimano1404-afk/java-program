package day3;

import java.util.Scanner;

public class isarmstrongnumber {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the integer");
            int n = sc.nextInt();
            int original = n;
            int c = n;
            int count = 0;
            int am = 0;

            while(n!=0){
                int a = n%10;
                n = n/10;
                count++;
            }
            while(original!=0){
                int a = original%10;
                original = original/10;
                am += (int) Math.pow(a, count);
            }

            if(am==c){
                System.out.println("the given integer is an armstrong number");
            }
            else{
                System.out.println("the given integer is not an armstrong number");
            }
        }

}
