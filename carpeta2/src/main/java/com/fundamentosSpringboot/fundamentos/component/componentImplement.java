package com.fundamentosSpringboot.fundamentos.component;
import org.springframework.stereotype.Component;

@Component
public class componentImplement implements ComponentDepency {

    @Override
    public void saludar() {
        System.out.println("HOLA MUNDO SPRINGBOOT!!!");
    }
}
