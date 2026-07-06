package day10;
class node1{
    void display(){
        System.out.println("hello");
    }
}
class node2 extends node1{
    void dis(){
        System.out.println("worls");
    }
}
public class sing_inher {
    public static void main(String[] args){
        node2 n2=new node2();
        n2.dis();
        n2.display();
    }
}
