package day1;

import java.util.Scanner;

public class countdigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        while(a!=0){
            int pop=a%10;
            count++;
            a=a/10;
        }
        System.out.println(count);
    }
}
