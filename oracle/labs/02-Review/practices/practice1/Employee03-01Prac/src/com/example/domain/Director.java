package com.example.domain;

public class Director extends Manager{
    //field budget
    private double budget;
    
    //Constructor
    public Director(int id, String name, String sSn, double salary, String deptname, double budget) {
        super(id, name, sSn, salary, deptname);
    }
    
    //getter of budget
    public double setBudget(){
        return budget;
    }
    
    
}
