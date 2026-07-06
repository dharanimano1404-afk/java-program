package day8;
import java.util.Arrays;
public class anagramcheck {
    public static void main(String[] args){
        String str="hello";
        String strg="lohel";
        char[] ch=str.toCharArray();
        char[] cha=strg.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(cha);
        if(Arrays.equals(ch,cha)){
            System.out.println("it is anagram");
        }
        else{
            System.out.println("Not anagran");
        }

    }

}
