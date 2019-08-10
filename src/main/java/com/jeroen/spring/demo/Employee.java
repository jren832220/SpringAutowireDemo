package com.jeroen.spring.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Employee {

    private int employeeNumber;
    private String name;
    private String firstName;
    private String address;
    private String city;
    private String state;
    private String zip;
    @Autowired
    private Laptop laptop;


    public void show(){
        System.out.println("in show");
    }
}
