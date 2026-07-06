package day2;

import java.util.Scanner;

public class even_odd_digit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int countE=0;
        int countO=0;
        while(a!=0){
            int pop=a%10;
            if(pop%2==0){
                countE++;
            }
            else{
                countO++;
            }
            a=a/10;
        }
        System.out.println("Even digit:"+countE);
        System.out.println("Odd digit"+countO);
    }
}
