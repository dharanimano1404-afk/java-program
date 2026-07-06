package day12;
interface Animal{
    void sound();

}
class dog implements Animal{
    public void sound(){
        System.out.println("dog barking");
    }
}
class cat implements Animal{
    public void sound(){
        System.out.println("cat moew");
    }
}
class interfaceex {
    public static void main(String[] args){
        Animal c=new cat();
        Animal d=new dog();
        d.sound();
        c.sound();
    }
}