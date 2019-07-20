/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.metrica.calculadora.backend.web.ws.controller;

import com.metrica.calculadora.backend.modelo.service.CalculadoraService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Brasilio
 */

@RestController
@CrossOrigin(origins = "*", methods = {GET, POST, PUT})
@RequestMapping("/calcular")
public class CalculadoraController {
     private static final Logger LOGGER = LoggerFactory.getLogger(CalculadoraController.class);
     
    @Autowired
    private CalculadoraService calculadoraService;
        
    
     @RequestMapping(value = "/suma", method = RequestMethod.GET)
    public ResponseEntity suma_calcular(@RequestParam("numero1") int numero1,@RequestParam("numero2") int numero2) {
        try {
            Integer r = calculadoraService.sumar_numeros(numero1,numero2);
            return new ResponseEntity(r, HttpStatus.OK);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return new ResponseEntity(e, HttpStatus.OK);
        }
    }
}
