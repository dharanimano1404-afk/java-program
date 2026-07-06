import java.util.Scanner;

public class largestdigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int large=0;
        while(a!=0) {
            int pop=a%10;
            if(pop>large){
                large=pop;
            }
            a=a/10;
        }
        System.out.println("Largest digit is:"+large);
    }
}