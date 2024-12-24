package es.JCA.proyecto1.Proyecto1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//EL REST CONTROLLER INDICA QUE LA CLASE ES UN CONTROLLADOR REST
//@RestController

//
@Controller
public class miRestController {
    //DEFINE QUE EL METODO SALUDO MANEJA LAS SOLICITUDES EN ESE ENDPOINT CON UN RETURN EN UNA CADENA DE TEXTO ó si es un
    //Controller, podrá regresar un HTML como repsuesta en v ez de un XML o JSON
    @GetMapping("/")
    public String saludo(){
        return "index";
    }
}