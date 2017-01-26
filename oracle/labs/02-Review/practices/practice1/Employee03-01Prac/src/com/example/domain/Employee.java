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
        System.out.println("ID de empleado: "+getId());
        System.out.println("Nombre de empleado: "+getName());
        System.out.println("Numeros de Seguro Social: "+getSsN());
        System.out.println("Salario del Empleado: "+getSalary());
        System.out.println("\n");
    }
    
    
    
    
}
