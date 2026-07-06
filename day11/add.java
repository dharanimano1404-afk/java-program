package day11;
class add{
    public static int add1(int a,int b){
        return a+b;
    }
}
class static_key {
    public static void main(String[] args){
        int add2=add.add1(10,20);
        System.out.println(add2);
    }
}