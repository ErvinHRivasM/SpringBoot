package com.fundamentosSpringboot.fundamentos.component;
import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDepency {

    @Override
    public void saludar() {
        System.out.println("MAS QUE HOLA MUNDO!!! ");
    }
}
