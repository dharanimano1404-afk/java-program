package day11;
class Animal{
    String breed;
    public void makesound(){
        System.out.println("make sound");
    }
    public void issleeping(){
        System.out.print(" sleeping");
    }
}
class dog extends Animal{
    String dname;
    public dog(String dname,String breed){
        this.dname=dname;
        this.breed=breed;
    }
    public void makesound(){
        System.out.println(dname+" bark");
        System.out.println(breed);
    }
    public void issleeping(){
        System.out.print(dname+" Sleeping");
    }
}
class cat extends Animal{
    String name;
    public cat(String name){
        this.name=name;
    }
    public void makesound(){
        System.out.println(name +" meow");
    }
    public void issleeping(){
        System.out.println(name+" Sleeping");

    }
}
class eg_override {
    public static void main(String[] args){
        cat c=new cat("kitten");
        dog d=new dog("puppy","german");
        d.makesound();
        c.makesound();
        c.issleeping();
    }
}