package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Employee{
    String name;
    int id;
    double salary;
    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    abstract double salarycalculate();
    void display(){
        System.out.printf("%d %s ",id,name);

    }
}
class Manager extends Employee{
    public Manager(String name,int id,double salary){
        super(name, id, salary);
    }
    public double salarycalculate(){
        return salary+(0.20*salary);
    }
}
class developer extends Manager{
    public developer(String name,int id,double salary){
        super(name, id, salary);
    }
    public double salarycalculate(){
        return salary+(0.15*salary);
    }
}
class intern extends developer{
    public intern(String name,int id,double salary){
        super(name, id, salary);
    }
    public double salarycalculate(){
        return salary+(0.10*salary);
    }
}

class companyManagementSystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Employees: ");
        int n=sc.nextInt();
        List<Employee> employees=new ArrayList<>();

        for(int i=0;i<n;i++){
            System.out.println("Name of Employee:");
            String name=sc.next();
            System.out.println("Id: ");
            int id=sc.nextInt();
            System.out.println("Enter basic salary");
            double salary=sc.nextDouble();
            System.out.println("Enter the role:");
            String role =sc.next();

            Employee emp=null;
            switch (role){
                case "Manager":
                    emp = new Manager(name, id, salary);
                    break;
                case "Developer":
                    emp=new developer( name, id, salary);
                    break;
                case "Intern":
                    emp=new intern( name, id, salary);
                    break;
                default:
                    System.out.println("Invalid role");
                    break;
            }
            employees.add(emp);
        }
        for(Employee emp:employees){
            emp.display();
            String role=" ";
            if(emp instanceof Manager){
                role="Manager";
            }
            else if(emp instanceof developer){
                role="developer";
            }
            else if(emp instanceof intern){
                role="intern";
            }
            System.out.printf("%s %.1f\n",role,emp.salarycalculate());
        }
    }
}