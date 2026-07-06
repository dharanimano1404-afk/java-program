package day11;
class Ann{
    void display(){
        System.out.println("outer");
    }
    class a{
        void display(){
            System.out.println("inner");
        }
    }
}
class innerclass {
    public static void main(String[] args){
        Ann o=new Ann();
        Ann.a b=o.new a();
        b.display();

    }
}