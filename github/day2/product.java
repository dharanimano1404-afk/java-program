package day2;

import java.util.Scanner;

public class product {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int prod=1;
        while(a!=0){
            int pop=a%10;
            prod=prod*pop;
            a=a/10;
        }
        System.out.println(prod);
    }
}
