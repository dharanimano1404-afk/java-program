package day3;

import java.util.Scanner;
public class automorphicnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer:");
        int n = sc.nextInt();
        int square = n*n;
        int n1 = n%10;
        int square1 = square%10;
        System.out.println("the square of the given number is:"+square);
        if(square1==n1){
            System.out.println("the given number is automorphic");
        }
        else{
            System.out.println("the given integer is not automorphic");
        }
    }
}
