package es.JCA.proyecto1.Proyecto1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//EL REST CONTROLLER INDICA QUE LA CLASE ES UN CONTROLLADOR REST
//@RestController

//
@Controller
public class miRestController {
    //DEFINE QUE EL METODO SALUDO MANEJA LAS SOLICITUDES EN ESE ENDPOINT CON UN RETURN ENJ UNA CADENA DE TEXTO
    @GetMapping("/")
    public String saludo(){
        return "index";
    }
}