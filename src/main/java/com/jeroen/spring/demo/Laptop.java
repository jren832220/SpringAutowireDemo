package com.jeroen.spring.demo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Laptop {
    private int lId;
    private String brand;

    public void compile(){
        System.out.println("Compiling");
    }
}
