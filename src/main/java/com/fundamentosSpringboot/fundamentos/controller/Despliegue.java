package com.fundamentosSpringboot.fundamentos.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class Despliegue {

    @GetMapping
    public String mostrando(){
        return "Values";
    }

}
