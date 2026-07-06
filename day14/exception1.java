package day14;

import java.util.Scanner;

public class exception1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=0;
        try{
            n=sc.nextInt();
        }catch(Exception e){
            System.out.println("Invalid Input");
        }
        System.out.println(n);
    }
}