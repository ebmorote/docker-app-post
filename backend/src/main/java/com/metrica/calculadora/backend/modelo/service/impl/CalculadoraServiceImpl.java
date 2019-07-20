/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.metrica.calculadora.backend.modelo.service.impl;
import com.metrica.calculadora.backend.modelo.service.CalculadoraService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;



/**
 *
 * @author Brasilio
 */
@Service
public class CalculadoraServiceImpl  implements CalculadoraService{

     private static final Logger LOGGER = LoggerFactory.getLogger(CalculadoraServiceImpl.class);

    
    @Override
    public Integer sumar_numeros(int numero1, int numero2) throws Exception {
        int total = numero1+numero2;
        return total;
    }
    
  
      
}
