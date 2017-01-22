package com.example;
import com.example.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args){
        Employee employee = new Employee();
        
        employee.setId(101);
        employee.setName("Jane Smith");
        employee.setSocialSecutiryNumber("012-34-5678");
        employee.setSalary(120_345.27);
        
        System.out.println("Id de empleado: "+employee.getId());
        System.out.println("Nombre de empleado: "+employee.getName());
        System.out.println("Numero de Seguridad Social de empleado: "+employee.getSocialSecutiryNumber());
        System.out.println("Salario de empleado: "+employee.getSalary());
    }

    
}
