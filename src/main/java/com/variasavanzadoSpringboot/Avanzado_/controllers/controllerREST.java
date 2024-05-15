package com.variasavanzadoSpringboot.Avanzado_.controllers;

import com.variasavanzadoSpringboot.Avanzado_.models.ObjetosPost;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Pruebas")
public class controllerREST {

    @GetMapping
    public String validacionREST(){
        return "REST Valido...";
    }

    @GetMapping("/{Algo}")
    public String EnviandoAlgo(@PathVariable("Algo") String name){
        return name+" Alejo..";
    }

    @PostMapping
    public int validandoPost0(@RequestBody ObjetosPost objetos){
        System.out.println("imprimiento..Nombre: "+objetos.getName()+" Valor: "+objetos.getValor());
        objetos.setValor(objetos.getValor()*25);
        return objetos.getValor();
    }

    @PostMapping("/Pruebas_")
    public int validandoPost1(@RequestBody ObjetosPost objetos){
        System.out.println("imprimiento..Nombre: "+objetos.getName()+" Valor: "+objetos.getValor());
        objetos.setValor(objetos.getValor()*351298946);
        return objetos.getValor();
    }

    @PostMapping("/validando")
    public String validandoPost2(@RequestBody ObjetosPost objetos){
        System.out.println("imprimiento..Nombre: "+objetos.getName()+" Valor: "+objetos.getValor());
        objetos.setName(objetos.getName()+ " Apellido : "+objetos.getValor());
        return objetos.getName();
    }


}
