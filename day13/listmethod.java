package day13;
import java.util.*;
class listmethood {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.addFirst(3);
        list.addLast(4);
        list.add(3,10);
        list.remove(3);

        List<Integer> list2= new ArrayList<>(Arrays.asList(1, 2));
        list.removeAll(list2);
        list.removeIf(n->n%2==0);
        list.add(1);
        list.add(2);
        list.retainAll(list2);
        list.clear();
        List<String> list5=new ArrayList<>();
        list5.add("A");
        list5.add("B");
        list5.add("C");
        list5.add("D");
        list5.remove("D");
        List<String> list3= new ArrayList<>(Arrays.asList("A","B"));
        System.out.println(list5);


        int n1=list5.indexOf("A");
        System.out.println(n1);
        int n2=list5.lastIndexOf("B");
        System.out.println(n2);
        boolean n3=list5.contains("C");
        System.out.println(n3);
        boolean n4=list5.containsAll(list3);
        System.out.println(n4);
        boolean n5=list5.isEmpty();
        System.out.println(n5);
        int n6=list5.size();
        System.out.println(n6);

    }
}