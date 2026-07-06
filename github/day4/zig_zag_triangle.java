package day4;

import java.util.Scanner;

public class zig_zag_triangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=i;
            int gap=n-1;
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a+=gap;
                gap--;
            }
            System.out.println();
        }
    }
}
