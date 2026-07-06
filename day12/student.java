package day12;
import java.util.*;
import java.util.ArrayList;

class student{
    private String name;
    private int age;
    private int id;
    public student(String name,int age,int id){
        this.name=name;
        this.age=age;
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }

    public void display(){
        System.out.println("Name:"+name+" Age:"+age+" id:"+id);
    }
}
class studentmanagement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //student s1=new student();
        List<student> studentList=new ArrayList<>();

//        studentList.add(new student("john",12,1));
//        studentList.add(new student("joy",12,2));
//        studentList.add(new student("meera",12,3));
//        for(student s:studentList){
//            s.display();
        for(int i=0;i<2;i++ ){
            String Name=sc.next();
            //s1.getName(Name);
            int Age=sc.nextInt();
            //s1.getAge(Age);
            int Id=sc.nextInt();
            //s1.getId(Id);
            student s1 = new student(Name, Age, Id);
            studentList.add(s1);

        }
        for(student s:studentList){
            s.display();
        }
    }
}