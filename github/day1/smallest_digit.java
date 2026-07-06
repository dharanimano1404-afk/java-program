package day1;

import java.util.Scanner;

public class smallest_digit {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int small=10;
            while(a!=0) {
                int pop=a%10;
                if(pop<small){
                    small=pop;
                }
                a=a/10;
            }
            System.out.println("smallest digit is:"+small);
        }

}