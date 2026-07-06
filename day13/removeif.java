package day13;
import java.util.*;
public class removeif {
    public static void main(String[] args) {
//     List<Integer> list=new ArrayList<>();
//        list.add(12);
//        list.add(13);
//        list.add(14);
//        list.add(14);
//        list.add(15);
//        list.add(16);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5,2));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2));
        //list2.removeIf(n -> n % 2 == 0);
        //list2.clear();
        //int n1=list2.indexOf(4);
        //int n= list2.lastIndexOf(2);
        //System.out.println(n1);
        //boolean n=list2.containsAll(list3);
        int n=list2.size();
        System.out.println(n);

    }
}