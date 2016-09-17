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
public class TipoServicio {
    private String Codigo;
    private String NombreServicio;

    /**
     * @return the Codigo
     */
    public String getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the NombreServicio
     */
    public String getNombreServicio() {
        return NombreServicio;
    }

    /**
     * @param NombreServicio the NombreServicio to set
     */
    public void setNombreServicio(String NombreServicio) {
        this.NombreServicio = NombreServicio;
    }
}
