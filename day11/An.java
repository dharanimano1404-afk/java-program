package day11;
class  An {
    An(){
        System.out.println("A");
    }
    An(int a){
        System.out.println("A is B");
    }
}
class B extends An{
    B(){
        System.out.println("B");
    }
    B(int a){
        super(a);
        System.out.println("B is A" );
    }
}
class super_key {
    public static void main(String[] args)
    {
        B a=new B(5);
    }
}