package com.example;
import com.example.domain.Employee;
import com.example.domain.Manager;
import com.example.domain.Engineer;
import com.example.domain.Admin;
import com.example.domain.Director;

public class EmployeeTest {
    public static void main(String[] args){
        //No logro setearlo
        Engineer engineer = new Engineer();
        
        //Correcto
        Manager manager = new Manager(207,"Barbara Jhonson","054-12-2367",109_501.36,"US Marketing");
       
        //No logro settear
        Admin admin = new Admin();
        
        //Correcto
        Director director = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
        
        
        
    }

    
}
