package day3;
import java.util.Scanner;
public class reverse_func {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int r=reverseint(n);
         System.out.println(r);
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

}
