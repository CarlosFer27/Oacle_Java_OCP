package com.example.domain;

public class Employee {
    //Fields
    private int id;
    private String name;
    private String sSn;
    private double salary;
    
    //Constructor
    public Employee(int id, String name,String sSn, double salary){
        this.id=id;
        this.name=name;
        this.sSn=sSn;
        this.salary=salary;
    }
    
    //getters y setters

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsN() {
        return sSn;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary (double increase){
        this.salary+=increase;
    }
    
    public void printEmployee (){
        System.out.println(getId());
        System.out.println(getName());
        System.out.println(getSsN());
        System.out.println(getSalary());
    }
    
    
    
    
}
