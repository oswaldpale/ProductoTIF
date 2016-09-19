/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author oswaldpale
 */
public class Producto {
    private String codigo;
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

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
