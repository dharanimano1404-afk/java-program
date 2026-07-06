package day14;
class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
class multithreading {
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        a.setPriority(10);

        a.start();
        b.start();

    }
}