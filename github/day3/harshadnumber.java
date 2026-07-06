package day3;

import java.util.Scanner;

public class harshadnumber {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the integer");
            int n = sc.nextInt();
            int o = n;
            int sum = 0;
            int a = 0;

            while(n!=0){
                a = n%10;
                n = n/10;
                sum += a;

            }
            if(o%sum==0){
                System.out.println("the given is a harshad number");
            }
            else{
                System.out.println("the given is not a harshad number");
            }

    }

}
