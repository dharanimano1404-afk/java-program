package day13;
import java.util.*;
public class listadd {
    public static void main(String[] args){
//        List<Integer> list=new ArrayList<>(20);
//        List<String> list2=new ArrayList<>(Arrays.asList("A","B","C"));
        List<String> list4=Arrays.asList("ear","nose");
        List<String> list3=new ArrayList<>();
//        System.out.println(list4);
//        list.add(12);
//        list.add(13);
//        list.add(14);
//        list.add(14);
//        list.add(15);
//        list.add(16);
//        for(int n:list){
//            System.out.println(n);
//        }

        list3.add("plum");
        list3.add("MAngo");
        list3.add("Apple");
        //System.out.println(list2);

        list3.add("Mango");
        list3.addFirst("Pineapple");
        list3.remove("Banana");
        list3.add(2,"grape");
        list3.remove(1);
        list3.addAll(2,list4);
        System.out.println(list3);
    }
}