package day3;

import java.util.Scanner;

public class first_last_sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        ;
        int last=0;
        int pop=a%10;
        last=pop;

        while(a>=10){
            a=a/10;
        }
        int first=a;
        int sum=first+last;
        System.out.println(sum);
    }
}
