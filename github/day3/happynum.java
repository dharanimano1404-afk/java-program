package day3;

import java.util.Scanner;

public class happynum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num1=num;

        while(num1!=1 && num1!=4){
            int sum=0;
            while(num1!=0) {
                int pop = num1 % 10;
                sum += pop*pop;
                num1=num1/10;
            }
            num1=sum;
        }
        if(num1==1){
            System.out.println("The number is Happy Number");
        }
        else{
            System.out.println("The number is not Happy number");
        }
    }
}
