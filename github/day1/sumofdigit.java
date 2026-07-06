package day1;

import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        while(a!=0){
            int pop=a%10;
            sum=sum+pop;
            a=a/10;
        }
        System.out.println(sum);
    }
}
