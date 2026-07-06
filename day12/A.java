package day12;
class A{
    String name="dhiya";
    void display(){
        System.out.println("Hello ");
    }
}
class B extends A{
    void display(){
        super.display();
        System.out.println("world");
        System.out.println(super.name);
    }
}
class super_method {
    public static void main(String[] args){
        B b=new B();
        b.display();
    }
}