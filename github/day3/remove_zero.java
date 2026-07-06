import java.util.Scanner;
public class remove_zero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer:");
        int n = sc.nextInt();
        int place = 1;
        int num=0;

        while(n!=0){
            int a = n%10;
            n = n/10;

            if(a==0){
                continue;
            }
            else{
                num += a*place;
                place *= 10;
            }
        }
        System.out.println("the given integer without zero is:"+num);
    }

}
