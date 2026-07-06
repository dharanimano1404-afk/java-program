package day2;
import java.util.Random;
import java.util.Scanner;
public class gameguess {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int num;
        int a=rand.nextInt(100);
        do{
            System.out.println("Enter a number:");
            num=sc.nextInt();
            if(num>a){
                System.out.println("The number is lower");
            }
            else if(num==a)
            {
                System.out.println("you got the number");
            }
            else{
                System.out.println("The number is higher");
            }
        }
        while(num<100);

    }

}
