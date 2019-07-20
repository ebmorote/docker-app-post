/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.metrica.calculadora.modelo.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Brasilio
 */
@Entity
@Table(name = "calculadora")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calculadora.findAll", query = "SELECT c FROM Calculadora c"),
    @NamedQuery(name = "Calculadora.findByCCalcualdorap", query = "SELECT c FROM Calculadora c WHERE c.cCalcualdorap = :cCalcualdorap"),
    @NamedQuery(name = "Calculadora.findByCNumero1", query = "SELECT c FROM Calculadora c WHERE c.cNumero1 = :cNumero1"),
    @NamedQuery(name = "Calculadora.findByCNumero2", query = "SELECT c FROM Calculadora c WHERE c.cNumero2 = :cNumero2"),
    @NamedQuery(name = "Calculadora.findByCTotal", query = "SELECT c FROM Calculadora c WHERE c.cTotal = :cTotal")})
public class Calculadora implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "c_calcualdorap")
    private Integer cCalcualdorap;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "c_numero1")
    private BigDecimal cNumero1;
    @Column(name = "c_numero2")
    private BigDecimal cNumero2;
    @Column(name = "c_total")
    private BigDecimal cTotal;

    public Calculadora() {
    }

    public Calculadora(Integer cCalcualdorap) {
        this.cCalcualdorap = cCalcualdorap;
    }

    public Integer getCCalcualdorap() {
        return cCalcualdorap;
    }

    public void setCCalcualdorap(Integer cCalcualdorap) {
        this.cCalcualdorap = cCalcualdorap;
    }

    public BigDecimal getCNumero1() {
        return cNumero1;
    }

    public void setCNumero1(BigDecimal cNumero1) {
        this.cNumero1 = cNumero1;
    }

    public BigDecimal getCNumero2() {
        return cNumero2;
    }

    public void setCNumero2(BigDecimal cNumero2) {
        this.cNumero2 = cNumero2;
    }

    public BigDecimal getCTotal() {
        return cTotal;
    }

    public void setCTotal(BigDecimal cTotal) {
        this.cTotal = cTotal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cCalcualdorap != null ? cCalcualdorap.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calculadora)) {
            return false;
        }
        Calculadora other = (Calculadora) object;
        if ((this.cCalcualdorap == null && other.cCalcualdorap != null) || (this.cCalcualdorap != null && !this.cCalcualdorap.equals(other.cCalcualdorap))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.metrica.calculadora.modelo.entidad.Calculadora[ cCalcualdorap=" + cCalcualdorap + " ]";
    }
    
}
