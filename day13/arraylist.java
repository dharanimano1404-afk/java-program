package day13;

import java.util.*;

public class arraylist {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        //list.remove("D");
        //list.remove(2);
        //list.removeAll(list);
        List<String> name=Arrays.asList("A","B");
        //list.removeAll(name);
        //list.retainAll(name);

        System.out.println(list);
    }
}