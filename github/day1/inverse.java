package day1;

import java.util.Scanner;

public class inverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a three digit number:");
        int a=sc.nextInt();
        int b=a%10;
        int c=a-b;
        int d=c/10;
        int e=d%10;
        int f=d-e;
        int g=f/10;
        int h=(b*100)+(e*10)+(g*1);
        System.out.println(h);

    }

}
