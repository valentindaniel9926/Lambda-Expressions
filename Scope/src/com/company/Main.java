package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);


        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });
       /* for(Employee employee : employees){
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
           *//* new Thread(() -> System.out.println(employee.getAge())).start();*//*
        }*/

        /*System.out.println("*************");
        for(int i=0; i<employees.size();i++){
            Employee employee = employees.get(i);
            System.out.println(employee.getName());
            new Thread(()-> System.out.println(employee.getAge())).start();
        }
*/
    }
    public final static  String doStringStuff(UpperConcat uc, String s1, String s2){
        return  uc.upperAndConcat(s1, s2);
    }

}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat{
    public String upperAndConcat(String s1 , String s2);
}
class AnotherClass{
    public String doSomething(){
        int i=0;
        UpperConcat uc = (s1,s2) -> {
            System.out.println("The lambda Expression's class is "  + getClass().getSimpleName());
            System.out.println("i in the lambda expression= " + i);
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

            System.out.println("The AnotherClass class's name : " + getClass().getSimpleName());
            return Main.doStringStuff(uc, "String1","String2");
    }
    public void printValue(){
        int number = 25;
        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("The value is " + number);
        };
        new Thread(r).start();
    }
}
