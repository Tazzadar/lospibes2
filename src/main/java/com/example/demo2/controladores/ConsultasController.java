package com.example.demo2.controladores;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultasController {

    @DeleteMapping(path = "consultas/{nombre_carta}")
    public String consultarCartas(@PathVariable(name = "nombre_carta") String nombre) {

        String saludo = "Como andan los pibes " + nombre;

        return saludo;
    }


}