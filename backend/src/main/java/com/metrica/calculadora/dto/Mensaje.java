/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metrica.calculadora.dto;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Brasilio
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Mensaje implements Serializable {

    private String codigo;
    private String mensaje;
    private int tipo;

    public Mensaje() {
    }

    public Mensaje(String codigo, String mensaje, int tipo) {
        this.codigo = codigo;
        this.mensaje = mensaje;
        this.tipo = tipo;
    }

}
