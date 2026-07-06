package day4;

import java.util.Scanner;

public class rev_palin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=reverseint(n);
        boolean p=palindrome(n);
        System.out.println(r);
        System.out.println(p);
    }

    static int reverseint(int n){
        int rev=0;
        while(n!=0){
            int pop=n%10;
            n=n/10;
            rev=rev*10+pop;
        }
        return rev;
    }

    static boolean palindrome(int n){
        int rev=0;
        while(n!=0){
            int pop=n%10;
            n=n/10;
            rev=rev*10+pop;
        }
        if(rev==n){
           return true;
        }
        else{
           return false;
        }

    }

}

