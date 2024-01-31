package com.multipleInheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee{

String name;

String lastName;

double salary;


public Employee(String name,String lastName,double salary){
    this.name=name;
    this.lastName=lastName;
    this.salary=salary;
}

public double getSalary(){
return salary;
} 

public static void main(String args[]){

ArrayList<Employee> emps=new ArrayList<Employee>();

emps.add(new Employee("ramesh","dhage",40000));
emps.add(new Employee("datta","ubale",50000));
emps.add(new Employee("rajesh","ubale",56000));
emps.add(new Employee("rani","kadam",43000));
emps.add(new Employee("rutuja","jadhav",53000));

System.out.println(emps);

        List<Employee> list=emps.stream().filter(emp -> emp.getSalary()>50000).collect(Collectors.toList());
        System.out.println(list);

        int aboveFifty=(int) emps.stream().filter(em->em.getSalary()>50000).count();
        System.out.println(aboveFifty);
        
        List<Employee> amplist=emps.stream().sorted().collect(Collectors.toList());
        
        System.out.println(amplist);
 
}

@Override
public String toString() {
	return "Employee [name=" + name + ", lastName=" + lastName + ", salary=" + salary + "]";
}


}











