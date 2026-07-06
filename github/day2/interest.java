
import java.util.Scanner;
public class interest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle amount:");
        int a=sc.nextInt();
        System.out.println("Enter the rate if interest");
        int b=sc.nextInt();
        System.out.println("Enter the year");
        int c=sc.nextInt();
        int d=(a*b*c)/100;
        System.out.println(d);
    }


}
