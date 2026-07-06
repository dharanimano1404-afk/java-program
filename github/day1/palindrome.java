package day1;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int rev=0;
        while(x>=0)
        {
            int pop=x%10;
            rev=rev*10+pop;
            x=x/10;
        }
        if(rev==x) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }


    }
}


