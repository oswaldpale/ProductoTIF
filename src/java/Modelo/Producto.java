/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author oswaldpale
 */
public class Producto {
    private String serial;
    private int IdSO; 
    private int IdtipoEquipo;

    /**
     * @return the serial
     */
    public String getSerial() {
        return serial;
    }

    /**
     * @param serial the serial to set
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * @return the IdSO
     */
    public int getIdSO() {
        return IdSO;
    }

    /**
     * @param IdSO the IdSO to set
     */
    public void setIdSO(int IdSO) {
        this.IdSO = IdSO;
    }
    
}
