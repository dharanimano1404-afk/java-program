package day14;
import java.util.*;
public class exception2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=" ";
        int id=0;
        int[] age ={};
        try{
            name=sc.next();
            id=sc.nextInt();
            System.out.println(age[10]);
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        catch(MissingFormatArgumentException e){
            System.out.println(e);
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}