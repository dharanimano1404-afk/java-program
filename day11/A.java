package day11;
abstract class A{
    abstract void display();
    abstract void run();

}
class Bx extends A{
    public void run(){
        System.out.println("Hello");
    }
    public void display(){
        System.out.println("Hello");
    }
}
class abstractclass {
    public static void main(String[] args){
        A b=new Bx();
        b.display();
        b.run();
    }
}