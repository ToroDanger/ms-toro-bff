package cl.toro.integration.ms_toro_bff.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class PruebaController {


    @GetMapping("/prueba/saludo")
    public String getMethodName() {
        return "Hello End-Word";
    }
    
}
