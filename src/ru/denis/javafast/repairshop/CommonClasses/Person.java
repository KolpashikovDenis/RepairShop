package ru.denis.javafast.repairshop.CommonClasses;

public class Person {
    protected String name;
    protected int salary;

    public Person(String name){
        this.name = name;
        salary = 0;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
}
