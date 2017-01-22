package com.example.domain;


public class Manager extends Employee{
    //field deptname
    private String deptname;
    
    //constructor
    public Manager(int id, String name, String sSn, double salary, String deptname){
        super(id,name,sSn,salary);
    }
    
    //getter of deptname
    public String getDeptName(){
        return deptname;
    }
    
    
    

}
