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
    private String idtipoequipo;
    private String idmarca;
    private String modelo;
    private String serial;

    /**
     * @return the idtipoequipo
     */
    public String getIdtipoequipo() {
        return idtipoequipo;
    }

    /**
     * @param idtipoequipo the idtipoequipo to set
     */
    public void setIdtipoequipo(String idtipoequipo) {
        this.idtipoequipo = idtipoequipo;
    }

    /**
     * @return the idmarca
     */
    public String getIdmarca() {
        return idmarca;
    }

    /**
     * @param idmarca the idmarca to set
     */
    public void setIdmarca(String idmarca) {
        this.idmarca = idmarca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

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
}
