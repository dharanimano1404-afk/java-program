package day13;
import java.util.*;
class modification {
    public static void main(String[] args){
        List<String> list= new ArrayList<>(Arrays.asList("A","B","C","D"));
        list.set(1,"b");
        list.replaceAll(s->s.toLowerCase());
        list.replaceAll(s->s.toUpperCase());
        Collections.reverse(list);
        Collections.sort(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}