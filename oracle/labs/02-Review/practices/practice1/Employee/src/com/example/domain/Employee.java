package com.example.domain;

public class Employee {
    //
    public int id;
    public String name;
    public String socialSecutiryNumber;
    public double salary;
    
    //Constructor
    public Employee(){
        
    }
    
    //getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecutiryNumber() {
        return socialSecutiryNumber;
    }

    public void setSocialSecutiryNumber(String socialSecutiryNumber) {
        this.socialSecutiryNumber = socialSecutiryNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
    
    
    
}
